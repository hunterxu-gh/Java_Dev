/**
 * Lst19_4_GenericSort
 */
public class Lst19_4_GenericSort {
    public static void main(String[] args) {
        Integer[] intArray = {new Integer(2), new Integer(4), new Integer(3)};
        Double[] doubleArray = {new Double(3.4), new Double(1.3), new Double(-22.1)};
        Character[] charArray = {new Character('a'), new Character('J'), new Character('r')};
        String[] strArray = {"Tom", "Susan", "Kim"};

        sort(intArray); // ?????????
        sort(doubleArray);
        sort(charArray);
        sort(strArray);

        printList(intArray);
        printList(doubleArray);
        printList(charArray);
        printList(strArray);
    }

    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
        // Find the minimum in the list[i+1..list.length−2]
            currentMin = list[i]; // 负责移动格子
            currentMinIndex = i; // 负责移动格子的标记

            for (int j = i + 1; j < list.length; j++) { // ?????????
            // 为什么 j = i + 1? 
            
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) { // ?????????
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void printList(Object[] list) {
        for (int i = 0; i < list.length; i++) { // ?????????
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
    
}