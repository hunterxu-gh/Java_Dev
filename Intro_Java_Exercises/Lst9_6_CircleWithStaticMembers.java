/**
 * Lst9_6_CircleWithStaticMembers
 */
public class Lst9_6_CircleWithStaticMembers {
    public static void main(String[] args) {
        Circle circle1 = new Circle1();
        System.out.println("C1: ");
        System.out.println("Radius: " + circle1.radius + " | Perimeter: " + circle1.getPerimeter() + " | Area: " + circle1.getArea());
        
        Circle circle2 = new Circle1(25);
        System.out.println("C2: ");
        System.out.println("Radius: " + circle2.radius + " | Perimeter: " + circle2.getPerimeter() + " | Area: " + circle2.getArea());
        
        Circle circle3 = new Circle1(125);
        System.out.println("C3: ");
        System.out.println("Radius: " + circle3.radius + " | Perimeter: " + circle3.getPerimeter() + " | Area: " + circle3.getArea());
        System.out.println("--------------------------");
        System.out.println("Number of Circle Objects: " + Circle.getNumOfObjects());
    }
}
class Circle {
    double radius;

    // static varible
    static int numOfObjects = 0;
    
    // called a constructor
    Circle() { 
        radius = 1;
        numOfObjects++; // the use of static varible
    }

    Circle1(double newRadius) {
        radius = newRadius;
        numOfObjects++; // the use of static varible
    }

    // the use of static method
    static int getNumOfObjects() { 
        return numOfObjects;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}