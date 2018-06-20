package com.zucc.edu.dao.iface;

import com.zucc.edu.entity.ComputersEntity;

import java.util.List;

public interface IComputerDAO {
    boolean add(ComputersEntity newComputer);
    boolean delete(int id);
    boolean modify(ComputersEntity oldComputer,ComputersEntity newComputers);
    ComputersEntity find(int id);
    List<ComputersEntity> findByLabId(int labid);

}
