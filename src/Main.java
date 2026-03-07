import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "World";

        System.out.println("checking lexicographically");
        int result = string1.compareTo(string2);

        if (result > 0) {
            System.out.println(string1 + " is greater than " + string2);
        } else if (result < 0) {
            System.out.println(string1 + " is less than " + string2);
        } else {
            System.out.println(string1 + " is equal to " + string2);
        }

        String string3 = "Hello";
        String string4 = "Hello";

        int result1 = string1.compareTo(string2);

        if (result1 > 0) {
            System.out.println(string3 + " is greater than " + string4);
        } else if (result1 < 0) {
            System.out.println(string3 + " is less than " + string4);
        } else {
            System.out.println(string3 + " is equal to " + string4);
        }
        //Implement Comparable
        System.out.println("Implement Comparable");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(100, "Ab"));
        students.add(new Student(99, "AZ"));
        students.add(new Student(98, "IK"));
        for (Student student : students) {
            System.out.println(student);
        }
        students.sort(null);
        System.out.println("After sort using comparator on ID");
        for (Student student : students) {
            System.out.println(student);
        }
        //Implement Comparator
        System.out.println("Implement Comparator");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "CD", 22));
        employees.add(new Employee(3, "IK", 24));
        employees.add(new Employee(2, "BG", 22));
        System.out.println("Before sort");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("After sort using comparator");
        employees.sort(new ComparatorForEmployee());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

    }
}
