package Intro_Java_Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lst12_5_InputMismatchEx
 */
public class Lst12_5_InputMismatchEx {

    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer: ");
                int number = input.nextInt();

                System.out.println("The number is " + number);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect inout: an integer is required)");
                input.nextLine();
            }
        } while (continueInput);
    }
}