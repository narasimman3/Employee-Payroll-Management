package com.epm.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epm.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Optional<Employee>findByName(String name);
    
}
