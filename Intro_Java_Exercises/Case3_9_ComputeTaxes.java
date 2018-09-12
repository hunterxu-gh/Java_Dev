import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

/**
 * Case3_9_ComputeTaxes
 */
public class Case3_9_ComputeTaxes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your income: ");
        double income = input.nextDouble();
        
        System.out.println(
            "Enter your status(0 - single; 1 - married; 2 - married filling separately; 3 - head of househould): ");
        int status = input.nextInt();

        double tax;

        if (status = 0) {
            if (income <= 8350)
                tax = income * 0.10; 
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15; 
            else if (income <= 82250) 
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25; 
            else if (income <= 171550) 
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950) 
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33; 
            else 
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
            }
            
            else if (status == 1) { // Left as an exercise
            // Compute tax for married file jointly or qualifying widow(er) 
            } 
            else if (status == 2) { // Compute tax for married separately
            // Left as an exercise 
            } else if (status == 3) { // Compute tax for head of household
            // Left as an exercise 
            }
            else { 
                System.out.println("Error: invalid status"); 
                System.exit(1); 
            }
            
            // Display the result 
            System.out.println("Tax is " + (int)(tax * 100) / 100.0);
    }
}