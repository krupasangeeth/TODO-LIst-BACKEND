package com.example.rest.webservice.restfulwebservice.TODO.model;

import java.util.Date;

public class TodoModel {
    private long Id;
    private String UserName;
    private String Description;
    private Date TargetDate;
    private Boolean status;

    public TodoModel(long id, String userName, String description, Date TargetDate, Boolean status) {
        Id = id;
        UserName = userName;
        Description = description;
        this.TargetDate = TargetDate;
        this.status = status;
    }

    public long getId() {
        return Id;
    }
    public void setId(long id) {
        Id = id;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        Description = description;
    }
    public Date getDate() {
        return TargetDate;
    }
    public void setDate(Date targetDate) {
        this.TargetDate = targetDate;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }


    
}
