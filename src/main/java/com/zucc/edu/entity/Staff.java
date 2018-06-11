package com.zucc.edu.entity;

/**
 * 职员
 */
public class Staff {
    //编号
    private int idStaff;
    //职位
    private String positionStaff;
    //名字
    private String nameStaff;
    //密码
    private String passwordStaff;
    public Staff() {
    }

    public Staff(int idStaff, String positionStaff, String nameStaff, String password) {
        this.idStaff = idStaff;
        this.positionStaff = positionStaff;
        this.nameStaff = nameStaff;
        this.passwordStaff = password;
        //this.password = password;
    }

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

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public String getPasswordStaff() {
        return passwordStaff;
    }

    public void setPasswordStaff(String passwordStaff) {
        this.passwordStaff = passwordStaff;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Staff staff = (Staff) o;

        if (idStaff != staff.idStaff) return false;
//        if (positionStaff != null ? !positionStaff.equals(staff.positionStaff) : staff.positionStaff != null)
//            return false;
        //if (nameStaff != null ? !nameStaff.equals(staff.nameStaff) : staff.nameStaff != null) return false;
        if (passwordStaff != null ? !passwordStaff.equals(staff.passwordStaff) : staff.passwordStaff != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idStaff;
        result = 31 * result + (positionStaff != null ? positionStaff.hashCode() : 0);
        result = 31 * result + (nameStaff != null ? nameStaff.hashCode() : 0);
        result = 31 * result + (passwordStaff != null ? passwordStaff.hashCode() : 0);
        return result;
    }
}
