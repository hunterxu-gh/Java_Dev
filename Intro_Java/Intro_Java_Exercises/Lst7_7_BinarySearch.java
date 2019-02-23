package Intro_Java_Exercises;

/**
 * Lst7_7_BinarySearch
 */
public class Lst7_7_BinarySearch {

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (key < mid);
                high = mid - 1;
            else if (key == mid)
                return mid;
            else
                low = mid - 1;
        }
        return -low - 1;
    }
}

