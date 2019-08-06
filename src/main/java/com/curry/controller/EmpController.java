package com.curry.controller;

import com.curry.pojo.Emp;
import com.curry.services.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("/emp")
    public String hello(Model model){
        List<Emp> emps = empService.selAll();
        model.addAttribute("emps", emps);
        return "emp";
    }
}
