import java.time.LocalDate;

public class Manager extends Employee {
    private int teamSize;

    public Manager(int empId, String name, String department, int teamSize) {
        super(empId, name, department);
        this.teamSize = teamSize;
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