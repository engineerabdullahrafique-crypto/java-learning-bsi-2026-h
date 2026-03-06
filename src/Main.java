public class Main {
    public static void main(String[] args) {

        //Inheritance
        Student student1 = new Student("Abdullah", 1, 22, "male");
        student1.displayInfo();
        student1.eat();

        //Composition
        Student student2 = new Student("Abdullah", 1, 22, "male");
        student2.displayInfo();
        student2.eat();
        Human h1 = new Human("IK", 74, "male");
        Human.Heart hh1 = h1.new Heart(72);
        hh1.beat();

        //Association
        Student student3 = new Student("Bill Gates", 2, 70, "male");
        Courses courses1 = new Courses("Computer Science");
        System.out.println(student3 + " enrolled in " + courses1);

        //Aggregation
        Teacher teacher1 = new Teacher("Farhan", "English");
        Department department1 = new Department("Science", teacher1);
        department1.displayDepartment();
    }
}
