package com.epm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.epm.Model.Payroll;
import com.epm.Repository.PayrollRepository;

@Controller
public class PayrollController {

    @Autowired
    PayrollRepository repository;

    @GetMapping("/login")
    public String payrollpage(){
        return"login";
    }

    @PostMapping("/login")
    public String payrollsave(@ModelAttribute Payroll payroll){
        repository.save(payroll);
        return"redirect:/payroll-list";
    }

@GetMapping("/payroll-list")
public String payrollList(Model model) {
    model.addAttribute("payrolls", repository.findAll());
    return "payroll-list";
}

    
}
