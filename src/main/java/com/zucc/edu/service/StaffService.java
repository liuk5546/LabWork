package com.zucc.edu.service;

import com.zucc.edu.dao.IStaffDAO;
import com.zucc.edu.entity.Staff;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class StaffService {
    @Autowired//自动注入
    IStaffDAO staffDAO;

    public List<Staff> queryAllUSers(){
        return staffDAO.getAll();
    }

    public boolean register(Staff staff){
        return staffDAO.add(staff);
    }
    public Staff getStaffById(int id){
        return staffDAO.getStaffById(id);
    }

    public boolean deleteStff(int id){
        return staffDAO.delete(id);
    }

    public boolean edit(Staff staff){
        return staffDAO.update(staff);
    }
}
