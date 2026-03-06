public class Circle extends Shape{

    private static final float PI = 3.142f;
    private float radius;

    public Circle(float r){
        this.radius = r;
    }

    @Override
    public void calculateArea() {
        float res = (radius*radius)*PI;
        System.out.println("Area Of Circle Is: " + res);
    }

    public static void main(String[] args){
        Circle c1=new Circle(3);
        c1.calculateArea();
    }
}
