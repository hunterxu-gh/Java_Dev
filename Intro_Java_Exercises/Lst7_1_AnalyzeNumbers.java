import java.util.Scanner;
/**
 * Lst7_1_AnalyzeNumbers
 */
public class Lst7_1_AnalyzeNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of iterms: ");
        int n = input.nextInt();

        double[] nums = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextDouble();
            sum += nums[i];
        }

        double average = sum / n;

        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > average)
                counter++;
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + counter);
    }
}