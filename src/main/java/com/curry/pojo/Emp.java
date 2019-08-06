package com.curry.pojo;

import java.util.Date;

public class Emp {
    private int id;
    private String empname;
    private double salary;
    private Date birthday;
    private int age;
    private int deptid;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", empname='" + empname + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ", age=" + age +
                ", deptid=" + deptid +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }
}
