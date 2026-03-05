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

    class Heart{
        private double heartRate;
        public Heart(double heartRate1){
            this.heartRate=heartRate1;
        }
        public void beat(){
            System.out.println(name+" heart is beating at "+heartRate);
        }
    }

}