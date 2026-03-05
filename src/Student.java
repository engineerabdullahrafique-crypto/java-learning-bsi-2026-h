public class Student extends Human {

    private int roll;

    public Student(String name, int roll, int age, String gendre) {
        super(name, age, gendre);
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public void reading(){
        System.out.println(name + " is Reading");
    }

    public void displayInfo(){
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + roll);
        System.out.println("Age: " + age);
    }
}