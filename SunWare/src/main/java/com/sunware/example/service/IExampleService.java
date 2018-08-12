package com.sunware.example.service;

import com.sunware.example.bean.pojo.Dept;

import java.util.List;
import java.util.Map;

public interface IExampleService {

    Map<String,Object> sunwareProData(Map<String, Object> stringObjectHashMap);

    List<Dept> qryDept(Dept dept);
}
