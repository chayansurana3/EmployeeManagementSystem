import java.time.LocalDate;

public class Department{
    private String departmentName;
    private static int departmentId;
    public static int totalEmployees;

    public Department(String departmentName, int departmentId){
        this.departmentName = departmentName;
        Department.departmentId = departmentId;
    }

    public Department(){
        this.departmentName = "IT";
        Department.departmentId = 1;
    }

    public int getDepartmentId(){
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentId(int departmentId){
        Department.departmentId = departmentId;
    }

    public void setDepartmentName(String departmentName){
        this.departmentName = departmentName;
    }


}