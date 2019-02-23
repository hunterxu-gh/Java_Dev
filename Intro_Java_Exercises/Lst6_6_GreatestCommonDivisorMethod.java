package Intro_Java_Exercises;

import java.util.Scanner;
/**
 * Lst_6_6_GreatestCommonDivisorMethod
 */
public class Lst_6_6_GreatestCommonDivisorMethod {

    public static int gcd(int x, int y) {
        int gcd = 1; // initial gcd is 1
        int k = 2; // Possible gcd

        while (k <= x && k <= y) {
            if (x % k == 0 && y % k == 0)
                gcd = k;
            k++;
        }
        return gcd;
    }

    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter two integers:
        System.out.print("Enter the first number: ");
        int x = input.nextInt();
        System.out.print("Enter the Second number: ");
        int y = input.nextInt();

        System.out.println("The greatest common divisor is: " + gcd(x, y));
    }   
}