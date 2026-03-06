public class Human {

    protected String name;
    protected int age;
    protected String gender;

    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    // Inner Class
    class Heart {
        private double heartRate;

        public Heart(double heartRate) {
            this.heartRate = heartRate;
        }

        public void beat() {
            System.out.println(name + "'s heart is beating at " + heartRate + " bpm");
        }
    }
}