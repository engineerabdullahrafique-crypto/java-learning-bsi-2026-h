public class CompositionDemo {
    public static void main(String[] args){
        Student s1=new Student("Abdullah",1,22,"male");
        s1.displayInfo();
        s1.eat();
        Human h1=new Human("IK",74,"male");
        Human.Heart hh1=h1.new Heart(72);
        hh1.beat();
    }

}
