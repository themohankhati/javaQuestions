package hm.questions;

public class Circle extends Shape{
    double radius;

    public Circle()
    {
        radius=1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        double area= 3.14* radius*radius;
        System.out.println("Area of the circle is "+ area);
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2*3.14*radius;
        System.out.println("and the perimeter of  circle is " +perimeter);
        return perimeter;
    }

    @Override
    public String toString() {
        return "A circle with radius "+radius+ ", which is the subclass of " +super.toString();
    }

    public static void main(String args[])
    {
        Circle circle= new Circle();
        circle.setRadius(1);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println(circle.toString());
    }
}
