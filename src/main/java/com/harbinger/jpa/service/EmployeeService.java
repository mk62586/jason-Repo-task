package com.harbinger.jpa.service;

import com.harbinger.jpa.model.Address;
import com.harbinger.jpa.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface EmployeeService {
     Employee saveEmploye(Employee employee);
    Employee fetchById(long id);
    List<Employee> findAll();
    Employee getData(Employee employee);
    Employee saveApplication2Data(Employee employee);

}
