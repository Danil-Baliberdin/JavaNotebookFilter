package JavaOOP;

public class Circle {
    private static double radius;

    public Circle(double radius){
        Circle.radius = radius;
    }
    public double calculateArea (){
        return (3.14*radius*radius);
    }
    public static double calculatePerimeter(){
        return (2*3.14*radius);
    }
    public double getRadius(){
        return radius;
    }
}
