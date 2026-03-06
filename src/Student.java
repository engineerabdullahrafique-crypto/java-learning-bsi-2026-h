public class Student extends Human {

    private int rollNumber;

    public Student(String name, int rollNumber, int age, String gender) {
        super(name, age, gender);
        this.rollNumber = rollNumber;
    }

    public int getRoll() {
        return rollNumber;
    }

    public void reading() {
        System.out.println(name + " is Reading");
    }

    @Override
    public String toString() {
        return "Student{\n" +
                "Name='" + name + "'\n" +
                "Roll=" + rollNumber + "\n" +
                "Age=" + age + "\n" +
                "}";
    }

    public void displayInfo() {
        System.out.println("Student Information");
        System.out.println("Name: " + name);
        System.out.println("Roll No.: " + rollNumber);
        System.out.println("Age: " + age);
    }
}