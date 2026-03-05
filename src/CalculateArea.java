public class CalculateArea {

    //Circle
    public double Area(float r){
        return (r*r)*3.142;
    }

    //Rectangle
    public double Area(float l, float w){
        return l*w;
    }

    //Triangle
    public double Area(double b,double h){
        return 0.5*b*h;
    }
    public static void main(String[] args){
        CalculateArea ar=new CalculateArea();

        System.out.println("Area Of Circle: "+ar.Area(2));
        System.out.println("Area Of Rectangle: "+ ar.Area(4,6));
        System.out.println("Area Of Triangle: " + ar.Area(6.7,56));
    }
}
