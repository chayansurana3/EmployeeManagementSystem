import java.time.LocalDate;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private LocalDate hireDate;
    private EmployeeType employeeType;

    public Employee(){
        this(0, "Unknown", "Unknown", 0.0, LocalDate.now(), EmployeeType.FULL_TIME);
        Department.incrementTotalEmployees();
    }

    public Employee(int id, String name, String dept, double sal, LocalDate hireDate, EmployeeType employeeType) {
        this.employeeId = id;
        this.name = name;
        this.department = dept;
        this.salary = sal;
        this.hireDate = hireDate;
        this.employeeType = employeeType;
        Department.incrementTotalEmployees();
    }

    public Employee(int id, String name, String dept){
        this(id, name, dept, 0.0, LocalDate.now(), EmployeeType.FULL_TIME);
        Department.incrementTotalEmployees();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmpId(int id) {
        this.employeeId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String dept) {
        this.department = dept;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public String toString(){
        return "Employee ID: " + this.getEmployeeId() + "\nEmployee Name: " + this.getName() + "\nDepartment: " + this.getDepartment() + "\nSalary: " + this.getSalary() + "\nHire Date: " + this.getHireDate() + "\nEmployee Type: " + this.employeeType;
    }

}