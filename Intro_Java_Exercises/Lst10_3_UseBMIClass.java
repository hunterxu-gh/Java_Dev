package Intro_Java_Exercises;

/**
 * Lst10_3_UseBMIClass
 */
public class Lst10_3_UseBMIClass {

    public static void main(String[] args) {
        Lst10_4_BMI BMI1 = new Lst10_4_BMI("Kim Yang", 18, 145, 170);
        System.out.println("The BMI for " + BMI1.getName() + " is " + BMI1.getBMI() + " " + BMI1.getStatus());

        Lst10_4_BMI BMI2 = new Lst10_4_BMI("Susan King", 215, 70);
        System.out.println("The BMI for " + BMI2.getName() + " is " + BMI2.getBMI() + " " + BMI2.getStatus());
    }
}