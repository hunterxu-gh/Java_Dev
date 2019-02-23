package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Ch2_12_RunLength
 */
public class Ch2_12_RunLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed and acceleration: ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = speed * speed / 2 / acceleration;

        System.out.println("The minimum runaway length for this airplane is " + length + " km.");
    }
}