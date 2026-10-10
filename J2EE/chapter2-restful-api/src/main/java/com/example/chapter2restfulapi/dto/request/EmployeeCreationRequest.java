package com.example.chapter2restfulapi.dto.request;

import lombok.Data;

@Data
public class EmployeeCreationRequest {
    private String name;
    private String email;
    private String position;
}
