package com.wcq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wcq.entity.Student;
import com.wcq.service.IstuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StuController {

    @Reference
    private IstuService istuService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Student> list = istuService.list();
        model.addAttribute("stus",list);

        return "stulist";
    }
}
