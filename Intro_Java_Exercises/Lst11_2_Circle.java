package Intro_Java_Exercises;

/**
 * Lst11_2_Circle
 */
public class Lst11_2_Circle extends Lst11_1_GeometricObject {
    private double radius;
    
    public Lst11_2_Circle() {

    }

    public Lst11_2_Circle(double radius) {
        this.radius = radius;
    }

    public Lst11_2_Circle(double radius, String color, boolean filled) {
        // setColor(color);
        // setFilled(filled);
        super(color, filled); // using super keyword, it must be the 1st statement in the constrcutor.
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getPerimeter() {
        return radius * Math.PI * 2;
    }

    public void printCircle() {
        // System.out.println("The circle is created " + getDateCreated() + " and the radius is " + getRadius());
        // System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius;
        System.out.println("The circle is created " + super.getDateCreated() + " and the radius is " + radius);
    }
}