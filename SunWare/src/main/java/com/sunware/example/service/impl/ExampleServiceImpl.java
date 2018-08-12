package com.sunware.example.service.impl;

import com.sunware.example.mapper.ExampleDao;
import com.sunware.example.bean.pojo.Dept;
import com.sunware.example.service.IExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExampleServiceImpl implements IExampleService {

    @Autowired
    private ExampleDao exampleDao;

    @Override
    public Map<String, Object> sunwareProData(Map<String, Object> map) {
        map.put("name","juliy");
        map.put("school","high middle school");
        map.put("age",15);
        return map;
    }

    @Override
    public List<Dept> qryDept(Dept dept){
        return exampleDao.qryDept(dept);
    }
}
