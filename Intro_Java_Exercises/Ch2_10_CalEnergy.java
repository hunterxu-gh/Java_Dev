package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Ch2_10_CalEnergy
 */
public class Ch2_10_CalEnergy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilgrams: ");
        double kilograms = input.nextDouble(); 
        System.out.print("Enter the initial temprature: ");
        double initTemper = input.nextDouble(); 
        System.out.print("Enter the final temperature:  ");
        double finalTemper = input.nextDouble(); 

        double energy = kilograms * (finalTemper - initTemper) * 4184;
        System.out.println("The energy needed is: " + energy);
    }
}