package Intro_Java_Exercises;

import java.util.Scanner;

/**
 * ComputeArea
 */
public class ComputeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area;

        area = 3.14159 * radius * radius;

        System.out.println("The Area of the circle is: " + area);
    }
    
}