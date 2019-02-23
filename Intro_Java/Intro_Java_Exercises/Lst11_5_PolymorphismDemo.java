package Intro_Java_Exercises;

/**
 * Lst11_5_PolymorphismDemo
 */
public class Lst11_5_PolymorphismDemo {

    public static void main(String[] args) {
        displayObject(new Circle(1, "red", false));
        displayObject(new Rectangle(1, 1, "black", true));
    }

    public static void displayObject(Lst11_1_GeometricObject object) {
        System.out.println("Created on " + object.getDateCreated() + ". The color is " + object.getColor());
    }
}