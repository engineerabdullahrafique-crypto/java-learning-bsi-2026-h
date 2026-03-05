public class Human {

    protected String name;
    protected int age;
    protected String gendre;

    public Human(String n, int age, String g){
        this.name = n;
        this.age = age;
        this.gendre = g;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

}