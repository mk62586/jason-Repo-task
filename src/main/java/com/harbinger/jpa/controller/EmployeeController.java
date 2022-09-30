package com.harbinger.jpa.controller;

import com.harbinger.jpa.model.Address;
import com.harbinger.jpa.modelMapperConfig.EmployeeConverter;
import com.harbinger.jpa.payload.AddressPayload;
import com.harbinger.jpa.payload.EmployeePayload;
import com.harbinger.jpa.model.Employee;
import com.harbinger.jpa.repository.AddressRepository;
import com.harbinger.jpa.repository.EmployeeRepository;
import com.harbinger.jpa.response.ResponseValue;
import com.harbinger.jpa.service.EmployeeServiceImp;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    @Autowired
    private EmployeeServiceImp employeeService;
    @Autowired
    private EmployeeConverter employeeConverter;

    @Autowired
    private ResponseValue respValue;

    @Autowired
    private EmployeeRepository repo;

    @Autowired
    private AddressRepository addressRepository;


    @PostMapping("/saveEmployeeData")
    public Employee saveEmployee(@RequestBody Employee employee) {
        Date date = new Date();

        EmployeePayload employeePayload = new EmployeePayload();
        employeePayload.setEmpCode("103");
        employeePayload.setfName("Alex");
        employeePayload.setmName("Lilly");
        employeePayload.setGender('M');
        employeePayload.setPhoneNo(8966665665L);
        employeePayload.setDate(date);
        employeePayload.setiName("Mattew kr");

        AddressPayload addressPayload = new AddressPayload();
        addressPayload.setEmpId(3);
        addressPayload.setLine1("Delhi");
        addressPayload.setLine2("Mumbai");
        addressPayload.setCity("Pune");
        addressPayload.setCountry("India");
        addressPayload.setState("Jharkhand");
        addressPayload.setPinCode(760678);

        AddressPayload addressPayload1 = new AddressPayload();
        addressPayload1.setEmpId(4);
        addressPayload1.setLine1("Rampur");
        addressPayload1.setLine2("Ramgarh");
        addressPayload1.setCity("Delhi");
        addressPayload1.setCountry("India");
        addressPayload1.setState("Jharkhand");
        addressPayload1.setPinCode(905234);

        List<AddressPayload> addressPayloads = new ArrayList<>();
        addressPayloads.add(addressPayload);
        addressPayloads.add(addressPayload1);
        employeePayload.setAddressList(addressPayloads);

        Employee employees = employeeConverter.covertPayloadToEntity(employeePayload);
        return employeeService.saveEmploye(employees);
    }
    @GetMapping("/fetchById/{id}")
    public Employee fetchById(@PathVariable("id") int id){
        return employeeService.fetchById(id);
    }
    @GetMapping("/fetchAll")
    public List<Employee> fetchAll(){
        return employeeService.findAll();
    }
    @GetMapping("/fetch")
    public Employee getData(Employee employee){
        return employeeService.getData(employee);
    }

    @PostMapping("/saveApplication2Data")
    public Employee saveData(Employee employee){
        System.out.println("Application2 Payload  Data save successfully");
        Employee emp = getData(employee);
        return repo.save(emp);
    }
    @GetMapping("fetchAddressById/{id}")
    public Address fetchAddressById(@PathVariable("id") Long id){
       return addressRepository.findById(id).orElse(null);
    }
}





