package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Ch2_9_Acceleration
 */
public class Ch2_9_Acceleration {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v0, v1 and t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("The average acceleration is: " + (int)(a * 100) / 100.0 + "m/s.");
    }
}