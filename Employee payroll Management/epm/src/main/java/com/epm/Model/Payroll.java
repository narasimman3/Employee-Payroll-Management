package com.epm.Model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "payroll")
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private Long employeeId;
    private Double basicSalary;
    private Double bonus;
    private Double deduction;
    private Double netSalary;
    private Date payDate;
    private Double taxPercentage;
    private Double overtimeHours;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }
    public Double getBasicSalary() {
        return basicSalary;
    }
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Double getBonus() {
        return bonus;
    }
    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    public Double getDeduction() {
        return deduction;
    }
    public void setDeduction(Double deduction) {
        this.deduction = deduction;
    }
    public Double getNetSalary() {
        return netSalary;
    }
    public void setNetSalary(Double netSalary) {
        this.netSalary = netSalary;
    }
    public Date getPayDate() {
        return payDate;
    }
    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }
    public Double getTaxPercentage() {
        return taxPercentage;
    }
    public void setTaxPercentage(Double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }
    public Double getOvertimeHours() {
        return overtimeHours;
    }
    public void setOvertimeHours(Double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
    public String getPaymentMode() {
        return paymentMode;
    }
    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }
    public String getRemarks() {
        return remarks;
    }
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    private String paymentMode;
    private String remarks;
    
    
}
