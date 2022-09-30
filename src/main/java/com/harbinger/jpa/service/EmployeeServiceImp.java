package com.harbinger.jpa.service;

import com.harbinger.jpa.model.Address;
import com.harbinger.jpa.model.Employee;
import com.harbinger.jpa.modelMapperConfig.EmployeeConverter;
import com.harbinger.jpa.payload.EmployeePayload;
import com.harbinger.jpa.repository.EmployeeRepository;
import com.harbinger.jpa.response.ResponseValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class EmployeeServiceImp implements  EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private  ResponseValue response;

    @Autowired
    private EmployeeConverter employeeConverter;

    @Value("${application.url}")
    String Json_ServiceUrl ;

    //save Employee data
    @Override
    public Employee saveEmploye(Employee employee) {
        return employeeRepository.save(employee);
    }

    //fetch Employee data by id
    @Override
    public Employee fetchById(long id) {
        return employeeRepository.findById(id).orElse(null);
    }

   //fetch All data of employee
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    //fetch employee payload of data in Application2
    @Override
    public Employee getData(Employee employee) {

        EmployeePayload employeePayload = restTemplate.getForObject(Json_ServiceUrl, EmployeePayload.class);
        response.setEmployeePay(employeePayload);
        Employee emp = employeeConverter.covertPayloadToEntity(employeePayload);
        employeeRepository.save(emp);
        return emp;
    }

    //save Application2 employeePayload data to entity class
    @Override
    public Employee saveApplication2Data(Employee employee) {
        return employeeRepository.save(employee);
    }

}
