package com.harbinger.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.harbinger.jpa.payload.AddressPayload;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.ValueGenerationType;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
public class Employee  implements Serializable {
    @Id
    @GenericGenerator(name="empk" , strategy="increment")
    @GeneratedValue(generator="empk")
    private long id;
    private String empCode;
    private String fName;
    private String mName;
    private java.sql.Date date;
    private String iName;
    private char gender;
    private long phoneNo;
   // @JsonIgnore
    @OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name="ep_fk",referencedColumnName = "id")
    private List<Address> addressList;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }

}
