package com.sampleapproach.model;

import java.io.Serializable;

public class Customer implements Serializable{
    private static final long serialVersionUID = 1L;
    int custId;
    String acName;
    int age;
 
    public Customer(){
    }
 
    public Customer(int custId, String name, int age)     {
        this.custId = custId;
        this.acName = name;
        this.age = age;
    }
 
    public int getCustId() {
        return custId;
    }
    public void setCustId(int custId) {
        this.custId = custId;
    }
    public String getName() {
        return acName;
    }
    public void setName(String name) {
        this.acName = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "Customer [age=" + age + ", custId=" + custId + ", name=" + acName
        + "]";
    }
}