package com.zucc.edu.controller;

import com.zucc.edu.service.LogService;
import javafx.scene.shape.Path;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import javax.annotation.Resource;

@Controller
@RequestMapping(path = "/log")
public class LogsController {
    @Resource
    LogService logService;

    @RequestMapping("/stafflog")
    public ModelAndView getStaffLog(int id){
        ModelAndView mav = new ModelAndView(new MappingJackson2JsonView());
        mav.addObject(logService.staffLog(id));
        return mav;
    }
}
