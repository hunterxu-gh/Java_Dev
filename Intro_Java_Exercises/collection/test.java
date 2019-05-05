import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * test
 */
public class test {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("red", "blue", "green", "yellow");
        Collections.sort(list1);
        System.out.println(list1);

        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println("Index of red: " + Collections.binarySearch(list1, "red"));
        System.out.println("Index of cyan: " + Collections.binarySearch(list1, "cyan"));

        List<String> list2 = Arrays.asList();
        Collections.copy(list2, list1);
        System.out.println(list2);
    }
}