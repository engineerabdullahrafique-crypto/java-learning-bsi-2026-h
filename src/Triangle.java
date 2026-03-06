public class Triangle extends Shape{
    double base, height;

    public Triangle(double b, double h){
        this.base=b;
        this.height=h;
    }

    @Override
    public void calculateArea() {
        double res= 0.5 * base * height;
        System.out.println("Area Of Triangle Is: " + res);
    }

    public static void main(String[] args){
        Triangle t1=new Triangle(4,5);
        t1.calculateArea();
    }
}
