/**
 * Lst19_2_GenericMethod
 */
public class Lst19_2_GenericMethod {

    public static void main(String[] args) {
        Integer[] i = {1, 2, 3, 4, 5};
        String[] s = {"Beijing", "Shanghai", "Guangzhou"};

        print(s);
        print(i);
    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}