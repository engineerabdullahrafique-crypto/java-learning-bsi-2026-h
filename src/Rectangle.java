public class Rectangle extends Shape{

    double lenght,width;

    public Rectangle(double l, double w){
        this.lenght=l;
        this.width=w;
    }

    @Override
    public void calculateArea() {
    double res = lenght*width;
    System.out.println("Area Of Rectangle Is: " + res);
    }

    public static void main(String[] args){
        Shape r1=new Rectangle(3,4);
        r1.calculateArea();
    }
}
