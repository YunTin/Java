package com.sunware.example.service.impl;

import com.sunware.example.service.IExampleService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExampleServiceImpl implements IExampleService {


    @Override
    public Map<String, Object> sunwareProData(Map<String, Object> map) {
        map.put("name","juliy");
        map.put("school","high middle school");
        map.put("age",15);
        return map;
    }
}
