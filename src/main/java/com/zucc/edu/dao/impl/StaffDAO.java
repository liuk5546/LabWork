package com.zucc.edu.dao.impl;

import com.zucc.edu.dao.iface.IStaffDAO;
import com.zucc.edu.entity.Staff;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
@Repository//说明是数据访问层
public class StaffDAO implements IStaffDAO {


    @Resource(name = "sessionFactory")
    private SessionFactory sf;
    public List<Staff> getAll() {
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "From Staff";
        List<Staff> staffs = session.createQuery(hql).list();
        session.getTransaction().commit();
        session.close();
        return staffs;
    }

    public Staff getStaffById(int id) {

        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "From Staff where idStaff = ?";
        Staff staff = (Staff) session.createQuery(hql).setParameter(0,id).uniqueResult();
        session.getTransaction().commit();
        session.close();
        return staff;
    }

    public boolean add(Staff staff) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(staff);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean delete(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        Query query = session.createQuery("delete Staff s where s.idStaff=?");
        query.setParameter(0,id);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean update(Staff staff) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.update(staff);
        session.getTransaction().commit();
        session.close();
        return true;
    }

}
