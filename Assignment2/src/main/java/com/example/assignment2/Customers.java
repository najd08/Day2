package com.example.assignment2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

public class Customers {
    private String ID;
    private String Username;
    private double Balance;

    public Customers(double balance) {
        this.Balance = balance;
    }
    public double getBalance() {
        return Balance;
    }
    public void setBalance(double balance) {
        this.Balance = balance;
    }
    public String getId() {
        return ID;
    }
    public void setId(String Id) {
        this.ID = Id;
    }


}

