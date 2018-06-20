package com.zucc.edu.entity;

import java.sql.Timestamp;

public class LogsEntity {
    private int idLogs;
    private Timestamp startTime;
    private Timestamp endTime;
    private Integer fkIdStaff;
    private Integer fkIdComputers;

    public Integer getFkIdStaff() {
        return fkIdStaff;
    }

    public void setFkIdStaff(Integer fkIdStaff) {
        this.fkIdStaff = fkIdStaff;
    }

    public Integer getFkIdComputers() {
        return fkIdComputers;
    }

    public void setFkIdComputers(Integer fkIdComputers) {
        this.fkIdComputers = fkIdComputers;
    }

    public int getIdLogs() {
        return idLogs;
    }

    public void setIdLogs(int idLogs) {
        this.idLogs = idLogs;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LogsEntity that = (LogsEntity) o;

        if (idLogs != that.idLogs) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idLogs;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }
}
