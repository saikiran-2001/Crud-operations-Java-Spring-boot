package net.javaguide.springboot_backend.service;

import net.javaguide.springboot_backend.model.dto.EmployeeRequest;
import net.javaguide.springboot_backend.model.entity.Employee;
import net.javaguide.springboot_backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees;
    }

    public Employee saveEmployee(EmployeeRequest employeeRequest) {
        Employee e = new Employee();
        e.setEmailId(employeeRequest.getEmail());
        e.setFirstName(employeeRequest.getFirst_name());
        e.setLastName(employeeRequest.getLast_name());
        return employeeRepository.save(e);
    }
}
