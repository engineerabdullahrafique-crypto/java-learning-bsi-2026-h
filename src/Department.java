public class Department {
    String departName;
    private Teacher teacher;
    public Department(String deptName, Teacher teacher){
        this.departName = deptName;
        this.teacher=teacher;
    }

    public void displayDepartment(){
        System.out.println("Department: "+ departName);
        teacher.displayTeacher();
    }
}
