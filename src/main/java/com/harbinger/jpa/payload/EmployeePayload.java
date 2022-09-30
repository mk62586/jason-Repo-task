package com.harbinger.jpa.payload;

import java.util.Date;
import java.util.List;

public class EmployeePayload  {
    private long id;
    private String empCode;
    private String fName;
    private String mName;
    private String iName;
    private Date date;
    private char gender;
    private long phoneNo;


    private List<AddressPayload> addressList;

    public void setAddressList(List<AddressPayload> addressList) {
        this.addressList = addressList;
    }
    public List<AddressPayload> getAddressList() {
        return addressList;
    }

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

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public void setAddressPayloads(List<AddressPayload> addressPayloads) {
    }
}
