package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Ch2_3_Feet2Meters
 */
public class Ch2_3_Feet2Meters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the feet: ");

        double feet = input.nextDouble();
        double meters = feet * 0.305;

        System.out.println(feet + " feet is " + meters + " meters.");
    }
}