package com.example.rest.webservice.restfulwebservice.TODO.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoModel {

    @Id
    @GeneratedValue
    private Long Id;
    private String UserName;
    private String Description;
    private Date TargetDate;
    private Boolean status;

    public TodoModel(Long id, String userName, String description, Date TargetDate, Boolean status) {
        Id = id;
        UserName = userName;
        Description = description;
        this.TargetDate = TargetDate;
        this.status = status;
    }

    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
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
