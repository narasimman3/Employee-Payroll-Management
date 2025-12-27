package com.epm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.epm.Model.Employee;
import com.epm.Repository.EmployeeRepository;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeRepository repository;

    @GetMapping("/employee")
    public String employeepage(){
        return"employee";
    }

    @PostMapping("employee")
    public String employeesave(@ModelAttribute Employee employee){
        repository.save(employee);
        return"redirect:/login";
    }
    
}
