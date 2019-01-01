import java.util.Scanner;

/**
 * Lst10_1_TestLoan
 */
public class Lst10_1_TestLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Annual Interest Rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Lst10_2_Loan loan = new Lst10_2_Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\n" + 
        "The monthly payment is %.2f\nThe total payment is %.2f\n", 
        loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}