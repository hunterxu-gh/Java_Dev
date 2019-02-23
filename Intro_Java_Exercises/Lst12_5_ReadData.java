import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Lst12_5_ReadData
 */
public class Lst12_5_ReadData {

    public static void main(String[] args) throws IOException {
        File file = new File("Score.txt");

        try(Scanner input = new Scanner(file);) {
            // Read data from a file
            while (input.hasNext()) {
                String firstName = input.next();
                String mid = input.next();
                String lastName = input.next();
                int score = input.nextInt();
                System.out.println(firstName + " " + mid + " " + lastName + " scores " + score);
            }
        }
    }
}