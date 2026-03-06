public abstract class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String n, int age, String g){
        this.name=n;
        this.age=age;
        this.gender=g;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public abstract void displayDetails();
}
