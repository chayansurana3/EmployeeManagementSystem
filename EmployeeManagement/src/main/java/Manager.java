import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int empId, String name, String department, double salary, LocalDate hireDate, int teamSize) {
        super(empId, name, department, salary, hireDate, EmployeeType.FULL_TIME);
        this.teamSize = teamSize;
        Department.incrementTotalEmployees();
    }

    public Manager(int empId, String name, String department, int teamSize) {
        super(empId, name, department);
        this.teamSize = teamSize;
        Department.incrementTotalEmployees();
    }

    public Manager() {
        super();
        this.teamSize = 0;
        Department.incrementTotalEmployees();
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        String employeeDetails = super.toString();
        String managerDetails = "Manager{" + "teamSize=" + teamSize + '}';
        return employeeDetails + managerDetails;
    }
}