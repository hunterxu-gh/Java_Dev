package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * Exercise 1.11
 * (Population projection) 
 * The U.S. Census Bureau projects population based on the following assumptions:

■ One birth every 7 seconds 
■ One death every 13 seconds 
■ One new immigrant every 45 seconds

Write a program to display the population for each of the next five years. 
Assume the current population is 312,032,486 and one year has 365 days. 
Hint: In Java, if two integers perform division, the result is an integer. 
The fractional part is truncated. 
For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). 
To get an accurate result with the fractional part, 
one of the values involved in the division must be a number with a decimal point. 
For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

Ch2_11_PopulationProjection
Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years 
and displays the population after the number of years. 
Use the hint in Programming Exercise 1.11 for this program. 
The population should be cast into an integer. 
 */
public class Ch2_11_PopulationProjection {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of years: ");
        double numOfYears = input.nextDouble();

    }
}