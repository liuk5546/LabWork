package com.zucc.edu.dao.iface;

import com.zucc.edu.entity.Staff;

import java.util.List;

public interface IStaffDAO {
    List<Staff> getAll();
    Staff getStaffById(int id);
    boolean add(Staff staff);
    boolean delete(int id);
    boolean update(Staff staff);
}
