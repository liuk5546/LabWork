package com.zucc.edu.entity;

public class ComputersEntity {
    private int idComputers;
    private String ip;
    private String subnetMask;
    private Integer fkIdLab;

    public Integer getFkIdLab() {
        return fkIdLab;
    }

    public void setFkIdLab(Integer fkIdLab) {
        this.fkIdLab = fkIdLab;
    }

    public int getIdComputers() {
        return idComputers;
    }

    public void setIdComputers(int idComputers) {
        this.idComputers = idComputers;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSubnetMask() {
        return subnetMask;
    }

    public void setSubnetMask(String subnetMask) {
        this.subnetMask = subnetMask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ComputersEntity that = (ComputersEntity) o;

        if (idComputers != that.idComputers) return false;
        if (ip != null ? !ip.equals(that.ip) : that.ip != null) return false;
        if (subnetMask != null ? !subnetMask.equals(that.subnetMask) : that.subnetMask != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idComputers;
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        result = 31 * result + (subnetMask != null ? subnetMask.hashCode() : 0);
        return result;
    }
}
