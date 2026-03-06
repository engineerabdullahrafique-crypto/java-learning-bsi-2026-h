public class Employee extends Person{

    private int empID;
    private String deptName;
    public Employee(String name,int age, String g, int empID, String depName){
        super(name,age,g);
        this.empID=empID;
        this.deptName=depName;
    }

    @Override
    public void displayDetails() {
        System.out.println("Name Is "+getName()+" And " + getAge() + " Years Old " + " Working In " + deptName+ " And Employee ID Is " + empID);
        System.out.println("Gender Is: " + getGender());
    }
}
