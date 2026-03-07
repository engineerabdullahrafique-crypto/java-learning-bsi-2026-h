public class Student implements Comparable<Student> {
    private int id;
    private String studentName;

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    public String getstudentstudentName() {
        return studentName;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student object) {
        if (this.id > object.id) {
            return 1;
        } else if (this.id < object.id) {
            return -1;
        }
        return 0;
    }
}
