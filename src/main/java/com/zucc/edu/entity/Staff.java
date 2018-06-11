package com.zucc.edu.entity;

/**
 * 职员
 */
public class Staff {
    public Staff() {
    }

    public Staff(int idStaff, String positionStaff, String nameStaff, String nikeName, String password) {
        this.idStaff = idStaff;
        this.positionStaff = positionStaff;
        this.nameStaff = nameStaff;
        this.nikeName = nikeName;
        this.password = password;
    }

    //编号
    private int idStaff;
    //职位
    private String positionStaff;
    //名字
    private String nameStaff;
    //登陆名
    private String nikeName;
    //密码
    private String password;

    public int getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(int idStaff) {
        this.idStaff = idStaff;
    }

    public String getPositionStaff() {
        return positionStaff;
    }

    public void setPositionStaff(String positionStaff) {
        this.positionStaff = positionStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
