package com.example.customer_list.models;

import java.util.Date;

public class Customer {
    private String name;
    private String date;
    private String address;
    private String picture;

    public Customer(  String name,String date,String address,String picture) {
        this.address = address;
        this.date = date;
        this.name = name;
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Customer() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
