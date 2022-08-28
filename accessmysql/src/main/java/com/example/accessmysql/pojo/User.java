package com.example.accessmysql.pojo;

public class User {
    private int empNo;
    private String eName;
    private String job;

    public User(int empNo, String eName, String job) {
        this.empNo = empNo;
        this.eName = eName;
        this.job = job;
    }

    public User() {

    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setEname(String eName) {
        this.eName = eName;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getEmpNo() {
        return empNo;
    }

    public String getEname() {
        return eName;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return "User{" +
                "empNo=" + empNo +
                ", eName='" + eName + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
