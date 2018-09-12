import java.util.Scanner;

/**
 * Ch2_2_CylinderVal
 */
public class Ch2_2_CylinderVal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        
        //define PI as a constant type
        final double PI = 3.14159;
        //read data from the keyboard
        double radius = input.nextDouble();
        double length = input.nextDouble();
        //using the formula to compute
        double area = radius * radius * PI;
        double volume = area * length;
        //Display the results with two digits after the decimal point.
        System.out.println("The area is: " + (int)(area * 100) / 100.0);
        System.out.println("The volume is: " + (int)(volume * 100) / 100.0);
    }
}