/**
 * PrimeNumberMethod
 */
public class PrimeNumberMethod {

    public static boolean isPrime(int num) {
        for (int divisor = 2; divisor <= num / 2; divisor++)
            if (num % divisor == 0)
                return false; // If ture, the number is not prime        
        return true;
    }

    public static void pPrimeNums(int numOfPrimes) {
        final int NUM_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int counter = 0; // Count the nmber of prime numbers
        int number = 2; // A number to be tested for primeness

        // Repeatedly find prime numbers
        while (counter < numOfPrimes) {
            // Print the prime number and increase the count
            if (isPrime(number)) {
                counter++;
                if (counter % NUM_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.printf("%-5d\n", number);
                }
                else
                    System.out.printf("%-5d", number);
            }
            // Check whether the next number is prime
            number++;
        }
    }
    
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are: ");
        pPrimeNums(50);
    }
}