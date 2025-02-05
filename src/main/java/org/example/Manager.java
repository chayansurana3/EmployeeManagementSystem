package org.example;

import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int empId, String name, String department, double salary, LocalDate hireDate, int teamSize) {
        super(empId, name, department, salary, hireDate);
        this.teamSize = teamSize;
    }

    public Manager(int empId, String name, String department, int teamSize) {
        super(empId, name, department);
        this.teamSize = teamSize;
    }

    public Manager() {
        super();
        this.teamSize = 0;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Employee ID: " + getEmpId() + "\nManager Name: " + getName() + "\nDepartment: " + getDepartment() + "\nSalary: " + getSalary() + "\nHire Date: " + getHireDate() + "\nTeam Size: " + teamSize;
    }
}