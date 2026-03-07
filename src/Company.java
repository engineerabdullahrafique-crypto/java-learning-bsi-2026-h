import java.util.ArrayList;
import java.util.List;

public class Company {

    private String projectName;
    private String projectType;
    private List<Employee> employees;

    public Company(String projectName, String projectType, List<Employee> employees) {
        this.projectName = projectName;
        this.projectType = projectType;
        this.employees = employees;
    }

    public void displayInfo() {
        System.out.println("Project: " + projectName);
        System.out.println("Project Type: " + projectType);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("IK", 74, "Male", 1, "Pakistan");
        Employee employee2 = new Employee("Ab", 22, "Male", 2, "Pakistan");

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);

        Company company = new Company("AI System", "Software", employeeList);

        company.displayInfo();
    }
}