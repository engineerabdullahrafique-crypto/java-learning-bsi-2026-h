public class Department {
    String departmentName;
    private Teacher teacher;

    public Department(String deptName, Teacher teacher) {
        this.departmentName = deptName;
        this.teacher = teacher;
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        teacher.displayTeacher();
    }
}
