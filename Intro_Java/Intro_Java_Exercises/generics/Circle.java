/**
 * Circle
 */
public class Circle extends GeometricObject {
    private double radius;
    
    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
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

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public double getPerimeter() {
        return radius * Math.PI * 2;
    }

    public void printCircle() {
        // System.out.println("The circle is created " + getDateCreated() + " and the radius is " + getRadius());
        // System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius;
        System.out.println("The circle is created at " + super.getDateCreated() + " and the radius is " + radius);
    }
}