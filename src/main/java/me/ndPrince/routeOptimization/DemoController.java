package me.ndPrince.routeOptimization;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/demo")
public class DemoController {

    private final EmployeeRepository employeeRepository;

    @Value("${message:default message}")
    private String message;

    public DemoController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/message")
    public String getMessage(){
        return message;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }
}
