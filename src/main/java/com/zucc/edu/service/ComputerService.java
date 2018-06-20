package com.zucc.edu.service;

import com.zucc.edu.dao.iface.IComputerDAO;
import com.zucc.edu.entity.ComputersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService {
    @Autowired
    IComputerDAO computerDAO;

    public List<ComputersEntity> LabsComputer(int labid){
        return computerDAO.findByLabId(labid);
    }

    public boolean addComputer(ComputersEntity computersEntity){
        computerDAO.add(computersEntity);
        return true;
    }
}
