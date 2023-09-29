package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Home 
{
    // It is POJO clsses so create private methods
    private String owner;
    private int dorNo;

    //to connect the internet so create variable

   // private InternetConnection modem; // modem doest not have any connection of InternetConnecton so conntect us eautowiring
   @Autowired
   private InternetConnection modem;
    //generate geters and seters
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public int getDorNo() {
        return dorNo;
    }
    public void setDorNo(int dorNo) {
        this.dorNo = dorNo;
    }    

    //create one method
    public void connect()
    {
        System.out.println("Connecting server");

        // to connect internet use modem
        modem.switchOn();
    }

    //create constructor
    public Home()
    {
        System.out.println("Constructor Object");
    }
}
