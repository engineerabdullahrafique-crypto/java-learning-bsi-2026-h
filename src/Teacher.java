public class Teacher {

    String teacherName;
    String subject;

    public Teacher(String teacherName, String subject) {
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public void displayTeacher() {
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Subject: " + subject);
    }

    @Override
    public String toString() {
        return "Teacher{\n" +
                "Name='" + teacherName + "'\n" +
                "Subject='" + subject + "'\n" +
                "}";
    }
}