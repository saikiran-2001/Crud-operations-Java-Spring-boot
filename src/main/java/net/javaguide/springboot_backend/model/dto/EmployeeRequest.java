package net.javaguide.springboot_backend.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class EmployeeRequest {
    private String email;
    private String first_name;
    private String last_name;
}
