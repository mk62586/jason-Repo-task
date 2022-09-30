package com.harbinger.jpa.config;

import com.harbinger.jpa.model.Employee;
import com.harbinger.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/*import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
*/
@Service
public class EmployeeDetailsServiceImp{

/*@Service
public class EmployeeDetailsServiceImp implements UserDetailsService {

    @Autowired
   private EmployeeRepository repository;

    @Override
    public UserDetails loadUserByUsername(String iName) throws UsernameNotFoundException {
        Employee employee = repository.findByEmployeeName(iName);
        return new User(employee.getUserName(),employee.getAddressList());
    }*/
    }

