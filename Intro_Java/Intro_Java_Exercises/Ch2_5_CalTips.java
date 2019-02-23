package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Ch2_5_CalTips
 */
public class Ch2_5_CalTips {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and the gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratRate = input.nextDouble();

        double gratuity = subtotal * gratRate / 100;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}