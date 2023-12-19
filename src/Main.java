import JavaBasics.Notebook;
import JavaOOP.Circle;
import JavaOOP.Rectangle;
import JavaOOP.Square;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.5);
        System.out.println("Площадь круга с радиусом "+circle.getRadius()+ " см = "+circle.calculateArea()+" см2");
        System.out.println("Периметр круга с радиусом "+circle.getRadius()+ " см = "+circle.calculatePerimeter()+" см");
        System.out.println("=============================================");
        Rectangle rectangle = new Rectangle(5,4);
        System.out.println("Длина прямоугольника в см = "+rectangle.getLength()+"\n"+"Ширина прямоугольника в см равна = "+rectangle.getWidth());
        System.out.println("Площадь прямоугольника в см = "+rectangle.calculateArea());
        System.out.println("Периметр прямоугольника в см = "+Rectangle.calculatePerimeter());
        System.out.println("=============================================");
        Square square = new Square(12.5);
        System.out.println("Длина квадрата в см = "+square.getLength()+"\n"+"Ширина прямоугольника в см равна = "+square.getWidth());
        System.out.println("Площадь квадрата в см = "+square.calculateArea());
        System.out.println("Периметр квадрата в см = "+square.calculatePerimeter());
        System.out.println("=============================================");

    }
}