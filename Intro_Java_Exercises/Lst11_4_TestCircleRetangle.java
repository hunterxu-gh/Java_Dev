package Intro_Java_Exercises;

/**
 * Lst11_4_TestCircleRetangle
 */
public class Lst11_4_TestCircleRetangle {

    public static void main(String[] args) {
        Lst11_2_Circle circle = new Lst11_2_Circle(1);
        System.out.println(circle.toString());
        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle.getDiameter());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    
        Lst11_3_Rectangle rec = new Lst11_3_Rectangle(2, 4);
        System.out.println(rec.toString());
        System.out.println(rec.getPerimeter());
        System.out.println(rec.getArea());
    }
}