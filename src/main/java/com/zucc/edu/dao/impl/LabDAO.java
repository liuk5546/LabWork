package com.zucc.edu.dao.impl;

import com.zucc.edu.dao.iface.ILabDAO;
import com.zucc.edu.entity.LabsEntity;
//import org.springframework.beans.factory.HierarchicalBeanFactory;
import com.zucc.edu.util.HibernateSessionFactor;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
@Repository
public class LabDAO implements ILabDAO {
    @Resource(name = "sessionFactory")
    private SessionFactory sf;
    public List<LabsEntity> getAll() {
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "from LabsEntity ";
        Query query = session.createQuery(hql);
        List<LabsEntity> list = query.list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    public LabsEntity getById(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        String hql = "from LabsEntity where idLab = ?";
        Query query = session.createQuery(hql);
        query.setParameter(0,id);
        LabsEntity lab = (LabsEntity) query.uniqueResult();
        session.getTransaction().commit();
        session.close();
        return lab;
    }

    public boolean add(LabsEntity lab) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(lab);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean delete(int id) {
        Session session = sf.openSession();
        session.beginTransaction();
        Query query = session.createQuery("delete LabsEntity l where l.idLab=?");
        query.setParameter(0,id);
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        return true;
    }

    public boolean modify(LabsEntity lab) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.update(lab);
        session.getTransaction().commit();
        session.close();
        return true;
    }


    public static void main(String[] args) {
        LabDAO dao = new LabDAO();
        System.out.print(dao.getAll().get(0).getNameLab());
    }
}
