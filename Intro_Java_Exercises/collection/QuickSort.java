/**
 * QuickSort
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] list = {1, 5, 2, 3, 7, 5, -7, 8};
        quickSort(list);
        for (int var : list) {
            System.out.print(var + " ");
        }
    }

    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length-1);
    }

    public static void quickSort(int[] list, int lo, int hi) {
        if (lo > hi) return;
        int pivotIndex = partition(list, lo, hi);
        quickSort(list, lo, pivotIndex - 1);
        quickSort(list, pivotIndex + 1, hi);
    }

    public static int partition(int[] list, int lo, int hi) {
        int pivot = list[lo];
        int i = lo + 1;
        int j = hi;

        while (j > i) {
            while (i <= j && list[i] <= pivot)
                i++;
            while (i <= j && list[j] > pivot)
                j--;

            if (i < j) {
                int temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }

        while (j > lo && list[j] >= pivot)
            j--;
        
        if (pivot > list[j]) {
            list[lo] = list[j];
            list[j] = pivot;
            return j;
        }
        else
            return lo;
    }
}