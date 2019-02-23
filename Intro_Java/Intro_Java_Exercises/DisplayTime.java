package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * DisplayTime
 */
public class DisplayTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input an integer for seconds: ");
        
        int seconds = input.nextInt();
        int minutes = seconds / 60;
        int remainSec = seconds % 60;

        System.out.println(seconds + " seconds is " + minutes + " minutes and " + 
                            remainSec + " seconds.");
    } 
}