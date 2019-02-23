package Intro_Java_Exercises;

/**
 * Lst7_8_SelectionSort
 */
public class Lst7_8_SelectionSort {

    public static void selectionSort(double[] list) {
        for (i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i...list.length-1]
            double currentMin = list[i];
            int currentIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentIndex != i) {
                list[currentIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}