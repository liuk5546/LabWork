package com.zucc.edu.controller;

import com.zucc.edu.entity.Staff;
import com.zucc.edu.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/staff")
public class StaffController {
    @Autowired
    StaffService staffService;

    @RequestMapping(path = "/index")
    public String index(Model model){
        model.addAttribute("list",staffService.queryAllUSers());
        return "Staff/index";
    }
    @RequestMapping(path = "/delete/{id}")
    public String delete(@PathVariable int id){
        staffService.deleteStff(id);
        return "redirect:/staff/index";
    }
    @RequestMapping("/addOne")
    public String addOne(Staff staff){
        staffService.register(staff);
        return "redirect:/staff/index";
    }

    @RequestMapping("/login")
    public String login(Staff staff){
        System.out.println(staff.getIdStaff()+" "+staff.getPasswordStaff());
        if(staffService.login(staff).getIdStaff() == -1){
            return "redirect:/error/permit";
        }else{
            System.out.print("正确");
            return "redirect:/staff/index";
        }
    }

}
