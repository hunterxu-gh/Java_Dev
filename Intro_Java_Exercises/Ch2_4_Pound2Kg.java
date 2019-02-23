package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Ch2_4_Pound2Kg
 */
public class Ch2_4_Pound2Kg {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Pounds: ");
        double pounds = input.nextDouble();
        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kg.");
    }
}