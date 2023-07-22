package hm.questions;

public class Square extends Rectangle{

    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    @Override
    public void setWidth(double width) {
        this.width=width;
    }

    @Override
    public void setLength(double length) {
        this.length=length;
    }

    @Override
    public double getPerimeter() {
        double perimeterofSquare=4*length;
        return perimeterofSquare;
    }

    @Override
    public double getArea() {
        double areaofSquare=length*length;
        return areaofSquare;
    }

    public String toString()
    {
        return "A Square with side=" +length + " which is a subclass of "+ super.toString();
    }

    public static void main(String args[])
    {
        Square square= new Square();
        square.setLength(12);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

        System.out.println(square.toString());
    }
}
