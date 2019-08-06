package com.curry.services;

import com.curry.dao.EmpMapper;
import com.curry.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpMapper empMapper;

    public List<Emp> selAll(){
        return empMapper.selAll();
    }
}
