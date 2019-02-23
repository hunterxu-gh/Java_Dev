package Intro_Java_Exercises;

/**
 * Lst9_1_TestCircle
 * 面向对象编程中类的编写的第1种形式：与主类成平行结构，只不过不能加访问限制符。
 * 比较推荐
 */
public class Lst9_1_TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("C1: ");
        System.out.println("Radius: " + circle1.radius + " | Perimeter: " + circle1.getPerimeter() + " | Area: " + circle1.getArea());
        
        Circle circle2 = new Circle(25);
        System.out.println("C2: ");
        System.out.println("Radius: " + circle2.radius + " | Perimeter: " + circle2.getPerimeter() + " | Area: " + circle2.getArea());
        
        Circle circle3 = new Circle(125);
        System.out.println("C3: ");
        System.out.println("Radius: " + circle3.radius + " | Perimeter: " + circle3.getPerimeter() + " | Area: " + circle3.getArea());
    }
}
class Circle {
    double radius;

    Circle() { // called a constructor
        radius = 1;
    }

    Circle(double newRadius) {
        radius = newRadius;
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
