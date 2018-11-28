package com.oocl.web.sampleWebApp.object;

public class User {
    String username;
    Integer userId;

    public User(){

    }

    public User(String username){
        this.username = username;
        this.userId = userId;
    }

    public String getUsername(){
        return username;
    }

    public Integer getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }
}


