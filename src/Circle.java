public class Circle extends Shape {

    private static final float PI = 3.142f;
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        float area = PI * radius * radius;
        System.out.println("Area of the Circle is: " + area);
    }

}