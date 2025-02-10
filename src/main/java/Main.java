import java.time.LocalDate;

public class Main {
    public void promoteEmployee(Employee employee){
        System.out.println("Employee" + employee.getName() + "promoted to Manager");
        System.out.println("Salary hiked to " + employee.getSalary() * 1.5);
        employee.setSalary(employee.getSalary() * 1.5);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Chayan Surana", "IT", 100000, LocalDate.of(2021, 1, 1));
        Manager m1 = new Manager(2, "John Doe", "HR", 5);
        Department d1 = new Department("IT", 1);
        Department d2 = new Department("Finance", 2);
        Department d3 = new Department("HR", 3);
        System.out.println("Welcome to the Employee Management System");
        System.out.println("Employee ID: " + emp1.getEmpId());
        System.out.println("Employee Name: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Salary: " + emp1.getSalary());
        System.out.println("Hire Date: " + emp1.getHireDate());
        System.out.println();
        System.out.println("Manager ID: " + m1.getEmpId());
        System.out.println("Manager Name: " + m1.getName());
        System.out.println("Department: " + m1.getDepartment());
        System.out.println("Salary: " + m1.getSalary());
        System.out.println("Hire Date: " + m1.getHireDate());
        System.out.println("Team Size: " + m1.getTeamSize());
        System.out.println();
        System.out.println("Total Employees: " + Department.totalEmployees);
    }
}
