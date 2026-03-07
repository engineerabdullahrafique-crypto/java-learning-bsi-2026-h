public class Employee extends Person {

    private int employeeId;
    private String departmentName;

    public Employee(String name, int age, String gender, int employeeId, String departmentName) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.departmentName = departmentName;
    }

    @Override
    public void displayDetails() {
        System.out.println(
                "Name: " + getName() +
                        ", Age: " + getAge() +
                        ", Gender: " + getGender() +
                        ", Department: " + departmentName +
                        ", Employee ID: " + employeeId
        );
    }
}