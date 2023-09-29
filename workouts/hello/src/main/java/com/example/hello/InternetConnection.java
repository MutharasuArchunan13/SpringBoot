package com.example.hello;

import org.springframework.stereotype.Component;

@Component
public class InternetConnection 
{
   //getters and setters
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    private String ip;
    private int speed;
    
    // provid eInternetConnection
    public void switchOn()
    {
        System.out.println("internet successfully connected");
    }
}
