import java.util.Scanner;

/**
 * Ch2_14_CalBMI
 */
public class Ch2_14_CalBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        
        double kilograms = 0.4536 * weight;
        double meters = 0.0254 * height;

        double BMI = kilograms / (meters * meters);
        System.out.println("BMI is " + BMI);
    }
}