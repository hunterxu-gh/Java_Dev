package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Ch2_7_NumOfYears
 */
public class Ch2_7_NumOfYears {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the minutes: ");
        int minutes = input.nextInt();

        int daysOfMin = minutes / 60 / 24;
        int days = daysOfMin % 365;
        int years = daysOfMin / 365;

        System.out.println(minutes + " minutes is approximately " + years +
                        " years and " + days + " days.");
    }
}