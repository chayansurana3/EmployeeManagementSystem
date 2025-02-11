import java.time.LocalDate;

public class Main {
    public static void promoteEmployee(Employee employee){
        employee.setSalary(employee.getSalary() * 1.5); // Assuming an increase by 1.5 times to the salary
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Chayan Surana", "IT", 100000, LocalDate.of(2021, 1, 1), EmployeeType.FULL_TIME);
        Manager m1 = new Manager(2, "John Doe", "HR", 5);
        Department d1 = new Department("IT", 1);
        System.out.println("Welcome to the Employee Management System");
        System.out.println("Employee Details: \n" + emp1.toString());
        System.out.println();
        System.out.println("Manager Details: \n" + m1.toString());
        System.out.println();
        System.out.println("Total Employees: " + Department.getTotalEmployees());
        promoteEmployee(emp1);
    }
}
