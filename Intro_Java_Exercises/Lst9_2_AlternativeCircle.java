/**
 * Lst9_2_AlternativeCircle
 * 面向对象编程中类的编写的第1种形式：与main放在同一个主类中，通过main调用直接测试
 * 不推荐
 */
public class Lst9_2_AlternativeCircle {

    public static void main(String[] args) {
        Lst9_2_AlternativeCircle circle1 = new Lst9_2_AlternativeCircle();
        System.out.println("C1: ");
        System.out.println("Radius: " + circle1.radius + " | Perimeter: " + circle1.getPerimeter() + " | Area: " + circle1.getArea());
        
        Lst9_2_AlternativeCircle circle2 = new Lst9_2_AlternativeCircle(25);
        System.out.println("C2: ");
        System.out.println("Radius: " + circle2.radius + " | Perimeter: " + circle2.getPerimeter() + " | Area: " + circle2.getArea());
        
        Lst9_2_AlternativeCircle circle3 = new Lst9_2_AlternativeCircle(125);
        System.out.println("C3: ");
        System.out.println("Radius: " + circle3.radius + " | Perimeter: " + circle3.getPerimeter() + " | Area: " + circle3.getArea());   
    }

    double radius;

    Lst9_2_AlternativeCircle() {
        radius = 1;
    }

    Lst9_2_AlternativeCircle(double newRadius) {
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