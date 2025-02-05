package org.example;

import java.time.LocalDate;

public class Employee {
    private int empId;
    protected String name;
    private String department;
    private double Salary;
    private LocalDate hireDate;
    private EmployeeType employeeType;

    public Employee(){
        this(0, "Unknown", "Unknown", 0.0, LocalDate.now());
    }

    public Employee(int id, String name, String dept, double sal, LocalDate hireDate) {
        this.empId = id;
        this.name = name;
        this.department = dept;
        this.Salary = sal;
        this.hireDate = hireDate;
        Department.totalEmployees++;
    }

    public Employee(int id, String name, String dept){
        this(id, name, dept, 0.0, LocalDate.now());
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return Salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setEmpId(int id) {
        this.empId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public void setSalary(double sal) {
        this.Salary = sal;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public String toString(Employee e){
        return "Employee ID: " + e.getEmpId() + "\nEmployee Name: " + e.getName() + "\nDepartment: " + e.getDepartment() + "\nSalary: " + e.getSalary() + "\nHire Date: " + e.getHireDate();
    }

}