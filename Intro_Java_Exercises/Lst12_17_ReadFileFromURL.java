import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
/**
 * Lst12_17_ReadFileFromURL
 */
public class Lst12_17_ReadFileFromURL {

    public static void main(String[] args) {
        System.out.println("Enter a URL");
        String URLString = new Scanner(System.in).next();

        try {
            URL url = new URL(URLString);
            int count = 0;
            Scanner input = new Scanner(url.openStream());

            while (input.hasNext()) {
                String line = input.nextLine();
                count += line.length();
            }

            System.out.println("The file size is " + count + " characters");
        }
        catch (MalformedURLException e) {
            System.out.println("Invalid URL");
        }
        catch (IOException e) {
            System.out.println("IO Errors: no such a file");
        }
    }
}