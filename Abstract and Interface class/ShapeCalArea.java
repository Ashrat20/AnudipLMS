package abstarctinterfacepack;

//Created Abstract class Shape
abstract class Shape
{
    // declare Constant for pi
    protected final double pi = 3.14;

    // declare a Abstract method to calculate area of circle
    abstract double calculateArea();
}

// Created a Class Circle extends Shape
class Circle extends Shape
{
    private double radius;

    // Created Constructor for Circle class
    public Circle(double radius) 
    {
        super(); // Call the constructor of the parent abstract class
        this.radius = radius;
    }

    // Override the calculateArea method to calculate the area of a circle
    @Override
    double calculateArea() 
    {
        System.out.println("Area of Circle: " + pi * radius * radius);
        return 0;
    }   
}
// Created a Class Rectangle extends Shape
class Rectangle extends Shape
{
    private double length;
    private double breath;

    // Created a Constructor for Rectangle
    public Rectangle(double length, double breath) 
    {
        super(); // Call the constructor of the parent abstract class
        this.length = length;
        this.breath = breath;
    }

    // Override the calculateArea method to calculate the area of a rectangle
    @Override
    double calculateArea() 
    {
        System.out.println("Area of Rectangle: " + length * breath);
        return 0;
    }
}

public class ShapeCalArea 
{
    public static void main(String[] args) 
    {
        // Create a Circle object with a radius of 9
        Circle cr = new Circle(9);
        //calling the method for area of the circle
        cr.calculateArea();

        // Create a Rectangle object with length 8 and breadth 9
        Rectangle robj = new Rectangle(8, 9);
        // calling the method for area of the rectangle
        robj.calculateArea();
    }
}
