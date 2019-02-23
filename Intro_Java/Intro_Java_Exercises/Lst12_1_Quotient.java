package Intro_Java_Exercises;

import java.util.Scanner;
/**
 * Lst12_1_Quotient
 */
public class Lst12_1_Quotient {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();

        // 1. Quotien without exception handling
        //System.out.println(n1 / n2);

        // 2. Quotient with if method
        // if (n2 != 0)
        //      System.out.println(n1 / n2);

        // 3. Quotient with catch-exception method
        
        try {
            if (n2 == 0 )
                throw new ArithmeticException("Divisor cannot be zero");
            else
                System.out.println(n1 / n2);
        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: an integer cannot be divided by zero ");
        }
        System.out.println("Excurion continues...");

    }
}