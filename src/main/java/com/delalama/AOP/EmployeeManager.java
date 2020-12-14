package com.delalama.AOP;

import model.EmployeeDTO;
import org.springframework.stereotype.Component;

@Component
public class EmployeeManager
{
    public EmployeeDTO getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new EmployeeDTO();
    }
}