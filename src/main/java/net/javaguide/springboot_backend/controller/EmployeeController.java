package net.javaguide.springboot_backend.controller;

import net.javaguide.springboot_backend.model.dto.EmployeeRequest;
import net.javaguide.springboot_backend.model.entity.Employee;
import net.javaguide.springboot_backend.repository.EmployeeRepository;
import net.javaguide.springboot_backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/api/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/api/employee/save")
    public String saveEmployee(@RequestBody EmployeeRequest employeeRequest) {
        Employee saved = employeeService.saveEmployee(employeeRequest);
        if(saved != null) {
            return "Successfully saved employee" + saved.getFirstName() + "with ID: " + saved.getId();
        } else {
            return "Unable to save Employee!";
        }
    }
}
