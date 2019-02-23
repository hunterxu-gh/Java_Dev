package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * ComputeAreaWithConstant
 */
public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the radius: ");
        
        double radius = input.nextDouble();
        final double PI = 3.14159;
        double area = PI * PI * radius;

        System.out.println("The area of the circle is: " + area);

    }
    
}