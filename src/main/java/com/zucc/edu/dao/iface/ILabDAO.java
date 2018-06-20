package com.zucc.edu.dao.iface;

import com.zucc.edu.entity.LabsEntity;

import java.util.List;

public interface ILabDAO {
    public List<LabsEntity> getAll();
    public LabsEntity getById(int id);
    public boolean add(LabsEntity lab);
    public boolean delete(int id);
    public boolean modify(LabsEntity lab);
}
