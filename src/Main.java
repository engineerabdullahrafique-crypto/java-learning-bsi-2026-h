public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(3, 4);
        Shape triangle = new Triangle(5, 6);

        circle.calculateArea();
        rectangle.calculateArea();
        triangle.calculateArea();
    }
}