package Intro_Java_Exercises;

/**
 * Lst12_8_TestCircleWithEx
 */
public class Lst12_8_TestCircleWithEx {

    public static void main(String[] args) {
        try {
            Lst12_7_CircleWithEx c1 = new Lst12_7_CircleWithEx(5);
            Lst12_7_CircleWithEx c2 = new Lst12_7_CircleWithEx(-5);
            Lst12_7_CircleWithEx c3 = new Lst12_7_CircleWithEx(0);
        }
        catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        
        System.out.println("The number of objects created: " + Lst12_7_CircleWithEx.getNumberOfObjects());
    }
}