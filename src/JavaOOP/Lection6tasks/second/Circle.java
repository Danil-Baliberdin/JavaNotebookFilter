package JavaOOP.Lection6tasks.second;

public class Circle extends Shape{
    protected double p;
    protected double radius;

    public Circle(double p, double radius) {
        this.p = p;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return p*radius*radius;
    }

    @Override
    public double getPerimetr() {
        return 2*p*radius;
    }
}
