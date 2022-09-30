package com.harbinger.jpa.repository;

import com.harbinger.jpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.security.core.userdetails.UserDetails;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //Employee findByEmployeeName(String fName);
}
