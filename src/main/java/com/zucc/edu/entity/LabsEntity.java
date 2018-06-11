package com.zucc.edu.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LabsEntity {
    private int idLab;
    private String nameLab;
    private String postionLab;
    private String descriptionLab;
    private String getWayLab;

    public int getIdLab() {
        return idLab;
    }

    public void setIdLab(int idLab) {
        this.idLab = idLab;
    }

    public String getNameLab() {
        return nameLab;
    }

    public void setNameLab(String nameLab) {
        this.nameLab = nameLab;
    }

    public String getPostionLab() {
        return postionLab;
    }

    public void setPostionLab(String postionLab) {
        this.postionLab = postionLab;
    }

    public String getDescriptionLab() {
        return descriptionLab;
    }

    public void setDescriptionLab(String descriptionLab) {
        this.descriptionLab = descriptionLab;
    }

    public String getGetWayLab() {
        return getWayLab;
    }

    public void setGetWayLab(String getWayLab) {
        this.getWayLab = getWayLab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LabsEntity that = (LabsEntity) o;

        if (idLab != that.idLab) return false;
        if (nameLab != null ? !nameLab.equals(that.nameLab) : that.nameLab != null) return false;
        if (postionLab != null ? !postionLab.equals(that.postionLab) : that.postionLab != null) return false;
        if (descriptionLab != null ? !descriptionLab.equals(that.descriptionLab) : that.descriptionLab != null)
            return false;
        if (getWayLab != null ? !getWayLab.equals(that.getWayLab) : that.getWayLab != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLab;
        result = 31 * result + (nameLab != null ? nameLab.hashCode() : 0);
        result = 31 * result + (postionLab != null ? postionLab.hashCode() : 0);
        result = 31 * result + (descriptionLab != null ? descriptionLab.hashCode() : 0);
        result = 31 * result + (getWayLab != null ? getWayLab.hashCode() : 0);
        return result;
    }


}
