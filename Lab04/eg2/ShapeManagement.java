// Interface
interface Drawable{
    void displayDetails();
}

// Abstract Class
abstract class Shape implements Drawable{
    protected String name;

    // Constructor
    public Shape(String name){
        this.name = name;
    }

    // Abstract Method
    public abstract double calculateArea();
}

// Derived Class 1
class Circle extends Shape{
    private double radius;

    public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public void displayDetails(){
        System.out.println("Shape: " + name);
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }
}


// Derived Class 2
class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String name,double length,double width){
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public void displayDetails(){
        System.out.println("Shape: " + name);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + calculateArea());
        System.out.println();
    }
}

// Main Class
public class ShapeManagement{
    public static void main(String[] args) {
        Shape s1 = new Circle("Circle", 5);
        Shape s2 = new Rectangle("Rectangle", 10, 5);

        s1.displayDetails();
        s2.displayDetails();
    }
}