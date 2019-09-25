package com.ics.demo.models;

public class Companies {
    private long companyId;
    private String name;

    public Companies() {
    }

    public Companies(long companyId, String name) {
        this.companyId = companyId;
        this.name = name;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
