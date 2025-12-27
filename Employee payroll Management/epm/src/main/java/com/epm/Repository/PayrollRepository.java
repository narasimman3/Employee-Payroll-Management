package com.epm.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epm.Model.Payroll;

public interface PayrollRepository extends JpaRepository<Payroll, Long>{
    Optional<Payroll>findByEmployeeId(String employeeId);
    
}
