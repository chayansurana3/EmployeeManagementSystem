import static java.time.LocalDate.*;

public class Department{
    private String departmentName;
    private static int departmentId;
    private static int totalEmployees;

    public Department(String departmentName, int departmentId){
        this.departmentName = departmentName;
        Department.departmentId = departmentId;
    }

    public Department(){
        this.departmentName = "IT";
        Department.departmentId = 1;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public static int getTotalEmployees(){
        return totalEmployees;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }
}