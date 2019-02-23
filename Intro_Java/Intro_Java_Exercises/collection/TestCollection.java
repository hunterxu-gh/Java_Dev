import java.util.*;
/**
 * TestCollection
 */
public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();

        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");

        System.out.println("A list of cities in collection1: ");
        System.out.println(collection1);

        System.out.println("\nIs Dallas in collection1? " + collection1.contains("Dallas"));

        collection1.remove("Dallas");
        System.out.println("\n" + collection1.size() + " cities are in collection1 now.");

        Collection<String> collection2 = new ArrayList<>(); 
        // 为什么用的是ArrayList？ 应该是和泛型有关

        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angeles");
        collection2.add("Atlanta");

        System.out.println("\nA list of cities in collection2: ");
        System.out.println(collection2);

        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("\nCities in c1 or c2: ");
        System.out.println(c1);

        c1 = (ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("\nCities in c1 and c2: ");
        System.out.println(c1);

        c1 = (ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("\nCities in c1, but not in c2: ");
        System.out.println(c1);
    }
}