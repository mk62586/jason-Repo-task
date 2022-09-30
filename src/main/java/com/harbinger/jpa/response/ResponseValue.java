package com.harbinger.jpa.response;

import com.harbinger.jpa.model.Employee;
import com.harbinger.jpa.payload.EmployeePayload;
import org.springframework.stereotype.Component;

@Component
public class ResponseValue {

    private Employee employee;
    private EmployeePayload employeePay;

    public EmployeePayload getEmployeePay() {
        return employeePay;
    }
    public void setEmployeePay(EmployeePayload employeePay) {
        this.employeePay = employeePay;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }


}
