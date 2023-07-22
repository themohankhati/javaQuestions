package hm.questions;

public class Rectangle extends Shape{
    double width;
    double length;

    public Rectangle()
    {
        width=1.0;
        length=1.0;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getPerimeter()
    {
        double perimeterofRectangle= 2*(length*width);
        return perimeterofRectangle;
    }

    public double getArea()
    {
        double areaofRectangle=length*width;
        return areaofRectangle;
    }

    public String toString()
    {
        return "A rectacngle with width =" +width + "and length = " +length+ ", which is the subclass of "+super.toString();
    }

    public static void main(String args[])
    {
        Rectangle rectangle= new Rectangle();
        rectangle.setLength(12);
        rectangle.setWidth(21);
        System.out.println(rectangle.toString());
    }
}
