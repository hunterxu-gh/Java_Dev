/**
 * Lst9_8_CircleWithPraviteDataFields
 */
public class Lst9_8_CircleWithPraviteDataFields {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("C1: ");
        System.out.println("Radius: " + circle1.getRadius() + " | Perimeter: " + circle1.getPerimeter() + " | Area: " + circle1.getArea());
        
        Circle circle2 = new Circle(25);
        System.out.println("C2: ");
        System.out.println("Radius: " + circle2.getRadius() + " | Perimeter: " + circle2.getPerimeter() + " | Area: " + circle2.getArea());
        
        Circle circle3 = new Circle(125);
        System.out.println("C3: ");
        System.out.println("Radius: " + circle3.getRadius() + " | Perimeter: " + circle3.getPerimeter() + " | Area: " + circle3.getArea());
        System.out.println("--------------------------");
        System.out.println("Number of Circle Objects: " + Circle.getNumOfObjects());
    }
}
class Circle {
    // pravite data fields
    private double radius;

    // static varible
    // pravate data fields
    private static int numOfObjects = 0;
    
    // called a constructor
    Circle() { 
        radius = 1;
        numOfObjects++; // the use of static varible
    }

    Circle(double newRadius) {
        radius = newRadius;
        numOfObjects++; // the use of static varible
    }

    // made a public getter method to get radius value
    public double getRadius() {
        return radius;
    }

    //public getter method
    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    // the use of static method
    public static int getNumOfObjects() { 
        return numOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }
}