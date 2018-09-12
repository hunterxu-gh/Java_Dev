import java.util.Scanner;

/**
 * Lst2_9_ComputeLoan
 */
public class Lst2_9_ComputeLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the interest rate: ");
        double annualInterestRate = input.nextDouble();
       
        System.out.print("Please enter the loan amount: ");
        double loanAmount = input.nextDouble();
        
        System.out.print("Please enter the number of years: ");
        int numOfYears = input.nextInt();

        double monthlyInterstRate = annualInterestRate / 1200;

        double monthlyPayment = (loanAmount * monthlyInterstRate) / (
            1 - 1 / Math.pow(1 + monthlyInterstRate, numOfYears * 12)); 

        double totalPayment = monthlyPayment * numOfYears * 12;

        System.out.println("The monthly payment will be: " + (int)(monthlyPayment * 100) / 100.0);
        System.out.println("The total payment will be: " + (int)(totalPayment * 100) / 100.0);
    }
}