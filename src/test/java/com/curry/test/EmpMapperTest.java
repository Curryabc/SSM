package com.curry.test;

import com.curry.dao.EmpMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMapperTest {
    @Test
    public void fun(){
        ApplicationContext ac = new
                ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        EmpMapper empMapper = ac.getBean("empMapper", EmpMapper.class);

        System.out.println(empMapper.selAll());
    }
}
