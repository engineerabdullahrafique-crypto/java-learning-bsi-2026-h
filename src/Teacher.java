public class Teacher {
    String name;
    String subject;
    public Teacher(String tName,String subject){
        this.name=tName;
        this.subject=subject;
    }

    public void displayTeacher(){
        System.out.println("Teacher Name Is: " + name);
        System.out.println("And Teach This Subject: "+subject);
    }
}
