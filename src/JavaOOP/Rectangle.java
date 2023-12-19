package JavaOOP;

import java.lang.reflect.Constructor;

public class Rectangle {
    protected static double width;
    protected static double length;

    public Rectangle(double l, double w){
        this.width = w;
        this.length = l;
    }
    public Rectangle(double x){
        this(x,x);
    }
    public Rectangle(){
        this(5);
    }
    public double calculateArea (){
        return (length*width);
    }
    public static double calculatePerimeter(){
        return (2*(length+width));
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
}
