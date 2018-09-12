import java.util.Scanner;

public class Ch2_1_ConC2F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Celsius Degree: ");
        double celDegree = input.nextDouble();

        double fahDegree = (9.0 / 5) * celDegree + 32;

        System.out.println("The " + celDegree + " Celsius degree is " + fahDegree +
                            " Fahrenheit Degree.");          
    }
}