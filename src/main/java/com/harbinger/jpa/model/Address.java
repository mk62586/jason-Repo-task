package com.harbinger.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Address implements Serializable {
    @Id
    @GenericGenerator(name="adrk" , strategy="increment")
    @GeneratedValue(generator="adrk")
    private long id;
    @Column(name="emp_id")
    private long empId;
    private String line1;
    private String line2;
    private String city;
    private String state;
    private String country;
    private int pinCode;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

}
