package Intro_Java_Exercises;

/**
 * Lst9_10_TestPassObject
 */
public class Lst9_10_TestPassObject {

    public static void main(String[] args) {
        Circle myCircle = new Circle(1); // Lst9.8
        int n = 5;
        
        printAreas(myCircle, n);

        System.out.println("\n" + "Radius is " + myCircle.getRadius());
        System.out.println("n is " + n);
    }

    public static void printAreas(Circle c, int times) {
        System.out.println("Radius \t\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}