public class Courses {

    String courseName;

    public Courses(String courseName){
        this.courseName = courseName;
    }

    public void courseInfo(){
        System.out.println("Course: " + courseName);
    }

    @Override
    public String toString() {
        return "Courses{" +
                "courseName='" + courseName + '\'' +
                '}';
    }
}