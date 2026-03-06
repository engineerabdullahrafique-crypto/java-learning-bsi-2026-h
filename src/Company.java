import java.util.ArrayList;
import java.util.List;

public class Company {

    private String projName;
    private String projType;
//    private Employee employee;
    private List<Employee> list;

    public Company(String projName, String projType, List<Employee> list) {
        this.projName = projName;
        this.projType = projType;
        this.list = list;
    }

    public void displayInfo(){
        System.out.println("Project "+ projName);
        System.out.println("Project Type " + projType);
        for(Employee e: list){
            e.displayDetails();
            System.out.println();
        }
    }

    public static void main(String[] args){
        Employee e1 = new Employee("IK",74,"male",1,"Pakistan");
        Employee e2 = new Employee("Ab",22,"male",2,"Pakistan");

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        Company c1 = new Company("AI System", "Software", list);

        c1.displayInfo();
    }
}
