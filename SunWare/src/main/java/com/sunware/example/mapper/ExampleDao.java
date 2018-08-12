package com.sunware.example.mapper;

import com.sunware.example.bean.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ExampleDao {

    List<Dept> qryDept(Dept dept);
}
