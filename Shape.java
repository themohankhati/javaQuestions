package hm.questions;

public class Shape {
    String color;
    boolean filled;

    public Shape()
    {
        color="green";
        filled=true;
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape of a color of "+ color + " and filled " + filled+".";
    }

    public static void main(String args[])
    {
        Shape shape= new Shape();
        shape.setColor("yellow");
        shape.setFilled(true);
        System.out.println(shape.toString());
    }
}

