package com.example.food_ordering_app.Model;

import java.util.ArrayList;

public class customerdetailsmodel {
    String fname, lname, phno, email, address;
    ArrayList<ordersmodel> orders;

    public customerdetailsmodel(String fname, String lname, String phno, String email, String address, ArrayList<ordersmodel> orders) {
        this.fname = fname;
        this.lname = lname;
        this.phno = phno;
        this.email = email;
        this.address = address;
        this.orders = orders;
    }

    public ArrayList<ordersmodel> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<ordersmodel> orders) {
        this.orders = orders;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
