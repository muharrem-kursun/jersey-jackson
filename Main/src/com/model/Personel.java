package com.model;


import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class Person {
    @QueryParam("name")//name' e deger yuklemek için
    private String name ;
    @QueryParam("surname")// surname ' e deger yuklemek için
    private  String surName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    @Override
    public String toString() {
        return  "name :   "+name+"surname :  "+surName;
    }
}
