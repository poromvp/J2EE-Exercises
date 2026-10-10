package com.example.chapter2restfulapi.controller;

import com.example.chapter2restfulapi.dto.request.EmployeeCreationRequest;
import com.example.chapter2restfulapi.entity.Employee;
import com.example.chapter2restfulapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody EmployeeCreationRequest request){
        return employeeService.createEmployee(request);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
