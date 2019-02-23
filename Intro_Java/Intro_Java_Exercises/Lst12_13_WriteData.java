import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Lst12_13_WriteData
 */
public class Lst12_13_WriteData {

    public static void main(String[] args) throws IOException {
        File file = new File("Score.txt");

        if (file.exists()) {
            System.out.println("File Already exists");
            System.exit(1);
        }

        //Scanner input = new Scanner(System.in);
        /*
        PrintWriter output = new PrintWriter(file);

        output.print("John T Smith ");
        output.println("90");
        output.print("Eric K Jones ");
        output.print("85");

        output.close();
*/
        // Lst 12.14 try-with-res syntax - close files automaticly
        try (PrintWriter output = new PrintWriter(file)) {
            output.print("John T Smith ");
            output.println("90");
            output.print("Eric K Jones ");
            output.print("85");
        }
    }
}