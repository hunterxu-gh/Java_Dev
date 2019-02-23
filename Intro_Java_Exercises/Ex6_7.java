// Exercise02_11.java: Create a method for computing future value
public class Ex6_7 {
    public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
  
      // Enter the investment amount
      System.out.print(
        "Enter the investment amount, for example 10000: ");
      double investmentAmount = input.nextDouble();
  
      // Enter yearly interest rate
      System.out.print("Enter monthly interest rate, for example 0.05: ");
      double monthlyInterestRate = input.nextDouble() / 12;

      int numOfYears = 30;

      System.out.printf("%-5s%20s\n", "Years", "Future Value");
      
      //futureInvestmentValue(10000, 0.05/12, 5);
      for (int i = 1; i <= numOfYears; i++) {
        double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
        System.out.printf("%-5d%20.2f\n", i, futureValue);
      }
    }

    public static double futureInvestmentValue(double investmentAmount, 
                                            double monthlyInterestRate, int years) {

        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
  
        //System.out.println("Future value is " + (int)(futureValue * 100) / 100.0);
    }
  }