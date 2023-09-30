package com.example.restdemo.model;

public class CloudUsers {
    private String userId;
    private String userName;
    private String userAddress;
    private String userNumber;

    public CloudUsers(String userId, String userName, String userAddress, String userNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.userNumber = userNumber;
    }

    public CloudUsers() {
    }

    public String getuserId() {
        return userId;
    }

    public void setuserId(String userId) {
        this.userId = userId;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserAddress() {
        return userAddress;
    }

    public void setuserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getuserNumber() {
        return userNumber;
    }

    public void setuserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

}
