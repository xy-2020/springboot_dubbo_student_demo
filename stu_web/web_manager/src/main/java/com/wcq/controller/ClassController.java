package com.wcq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wcq.entity.Classes;
import com.wcq.service.IClsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cls")
public class ClassController {

    @Reference
    private IClsService iClsService;

    @RequestMapping("/list")
    public String list(Model model){

        List<Classes> list = iClsService.list();
        model.addAttribute("clss",list);

        return "clslist";
    }
}
