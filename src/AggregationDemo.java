public class AggregationDemo {
    public static void main(String[] args){
        Teacher t1=new Teacher("Farhan", "English");
        Department d1=new Department("Science",t1);
        d1.displayDepartment();
    }
}
