import java.util.Scanner;

/**
 * CH7_OperationsOnArray
 */
public class CH7_OperationsOnArray {
    public static void main(String[] args) {
        double[] myList = new double[10];
        // 1. Initialize arrays with input values
        Scanner input = new Scanner(System.in);

        System.out.println("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++)
            myList[i] = input.nextDouble();

        // 2. Initializing arrays with random values.
        for (int i = 0; i < myList.length; i++)
            myList[i] = Math.random() * 100;

        // 3. Displaying arrays.
        for (int i = 0; i < myList.length; i++)
            System.out.print(myList[i] + " ");

        // 4. Summing all elements.
        double total = 0;
        for (int i = 0; i < myList.length; i++)
            total += myList[i];

        // 5. Finding the largest elements.
        // 6. Finding the smallest index of the largest element.
        double max = myList[0];
        int indexOfMax = 0;
        for (int i = 0; i < myList.length; i++)
            if (myList[i] > max) {
                max = myList[i]; // the largest element
                indexOfMax = i; // the smallest index of the largest number
            }

        // 7. Random Shuffling
        for (int i = 0; i < myList.length; i++) {
            // Generate an index j randomly
            int j = (int)(Math.random() * myList.length);
            
            // Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = myList[i];
        }

        // 8. Shifting elements
        double temp = myList[0];

        // Shift elements left
        for (int i = 0; i < myList.length; i++)
            myList[i-1] = myList[i];

        // Move the first element to fill in the last position.
        myList[myList.length-1] = temp;

        // 9. Simplifying coding
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();
        System.out.println("The month is " + months[monthNumber - 1]);
    
        // 10. Foreach loop
        for (double e: myList)
            System.out.println(e);
    }
    
}