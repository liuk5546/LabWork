package com.zucc.edu.dao;

import com.zucc.edu.entity.Staff;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository//说明是数据访问层
public class StaffDAO implements IStaffDAO{
    private static List<Staff> staffs = new ArrayList<Staff>();

    /**
     * 模拟数据库
     */
    static {
        staffs.add(new Staff(1,"教师","翁文勇","wwy","123456"));
        staffs.add(new Staff(2,"学生","刘坤","31501337","123456"));
        staffs.add(new Staff(3,"学生","汤帅","31501097","123456"));
    }

    public List<Staff> getAll() {
        return staffs;
    }

    public Staff getStaffById(int id) {
        for(Staff staff:staffs){
            if(staff.getIdStaff()==id){
                return staff;
            }
        }
        return null;
    }

    public boolean add(Staff staff) {
        staffs.add(staff);
        return true;
    }

    public boolean delete(int id) {
        staffs.remove(getStaffById(id));
        return true;
    }

    public boolean update(Staff staff) {
        Staff oldStaff = getStaffById(staff.getIdStaff());
        oldStaff.setNameStaff(staff.getNameStaff());
        return true;
    }
}
