package com.example.chapter2restfulapi.service;

import com.example.chapter2restfulapi.dto.request.EmployeeCreationRequest;
import com.example.chapter2restfulapi.entity.Employee;
import com.example.chapter2restfulapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(EmployeeCreationRequest request){
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setEmail(request.getEmail());
        employee.setPosition(request.getPosition());

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
}
