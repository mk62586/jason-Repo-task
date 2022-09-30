package com.harbinger.jpa.modelMapperConfig;

import com.harbinger.jpa.model.Employee;
import com.harbinger.jpa.payload.EmployeePayload;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeConverter {

    public Employee covertPayloadToEntity(EmployeePayload employeePayload){
        ModelMapper modelMapper = new ModelMapper();
      Employee employee  =modelMapper.map(employeePayload,Employee.class);
      return employee;
    }
    public EmployeePayload covertEntityToPayload(Employee employee){
        ModelMapper modelMapper = new ModelMapper();
        EmployeePayload employeeDto  =modelMapper.map(employee,EmployeePayload.class);
        return employeeDto;
    }

}
