package Intro_Java_Exercises;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Lst10_9_LargeFactorial
 */
public class Lst10_9_LargeFactorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println(n + "! is \n" + factorial(n));
    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}