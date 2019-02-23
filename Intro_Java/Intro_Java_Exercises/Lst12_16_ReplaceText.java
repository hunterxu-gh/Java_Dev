import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Lst12_16_ReplaceText
 */
public class Lst12_16_ReplaceText {

    public static void main(String[] args) throws IOException{
        // check command line parameter usage
        if (args.length != 4) {
            System.out.println("Usage: java ReplaceText sourceFile targetFile oldStr newStr");
            System.exit(1);
        }

        // check if sourcefile exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + "doesn't exist");
            System.exit(2);
        }

        // check if targetfile exists
        File targetFile = new File(args[0]);
        if (!targetFile.exists()) {
            System.out.println("Target file " + args[0] + "doesn't exist");
            System.exit(3);
        }

        // Create input and output files
        try (
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                output.println(s2);
            }
        }
    }
}