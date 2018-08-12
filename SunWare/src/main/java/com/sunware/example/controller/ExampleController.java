package com.sunware.example.controller;

import com.sunware.example.bean.pojo.Dept;
import com.sunware.example.service.IExampleService;
import com.sunware.example.utils.GsonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.sunware.example.service"})
public class ExampleController{

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private IExampleService exampleService;

    @RequestMapping("/")
    public String index(){
        return "Hello SpringBoot!";
    }

    @RequestMapping("/example1")
    public String example1(){
        Long l = System.currentTimeMillis();
        Map<String,Object> map;
        map = this.exampleService.sunwareProData(new HashMap<String,Object>());
        String result = GsonUtil.GsonString(map);
        this.logger.info("interface cost: " + (System.currentTimeMillis() - l) +" millis");
        this.logger.error("no error data!");
        return result;
    }

    @RequestMapping("/qryDeptTable")
    public String qryDeptTable(){
        List<Dept> depts = exampleService.qryDept(new Dept());
        return GsonUtil.GsonString(depts);
    }

    @RequestMapping("/qryDept")
    public String qryDept(@RequestBody Dept dept){
        List<Dept> list = exampleService.qryDept(dept);
        String result = GsonUtil.GsonString(list);
        return  result;
    }


}
