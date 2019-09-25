package com.ics.demo.models;

public class Departments {
    private long departmentId;
    private String name;


    public Departments() {
    }

    public Departments(long departmentId, String name) {
        this.departmentId = departmentId;
        this.name = name;

    }

    public long getId() {
        return departmentId;
    }

    public void setId(long departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
