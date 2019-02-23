package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Case3_8_ComputeBMI
 */
public class Case3_8_ComputeBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUNDS = 0.45359237;
        final double METERS_PER_INCHES = 0.0254;

        double kilograms = weight * KILOGRAMS_PER_POUNDS;
        double meters = height * METERS_PER_INCHES;

        double BMI = kilograms / (meters * meters);

        System.out.println("The BMI is "+ BMI);

        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI >= 18.5 && BMI <=25.0)
            System.out.println("Normal");
        else if (BMI >= 25.0 && BMI <=30.0)
            System.out.println("Overweight");
        else 
            System.out.println("Obese");
    }

}