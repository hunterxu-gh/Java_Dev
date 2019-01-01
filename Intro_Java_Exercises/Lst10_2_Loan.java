import java.util.Date;

/**
 * Lst10_2_Loan
 */
public class Lst10_2_Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    //
    private Date loanDate = new Date();

    Lst10_2_Loan() {
        this(2.5, 1, 1000);
    }

    Lst10_2_Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterstRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }
    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200; // / 100%
        double monthlyPayment = loanAmount * monthlyInterestRate / 
                        (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))); // How to understand?
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }
    public Date getLoanDate() {
        return loanDate;
    }
}