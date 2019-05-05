/**
 * QuickSortReview
 */
public class QuickSortReview {

    public static void main(String[] args) {
        
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
        int i = list[lo + 1];
        int j = list[hi];

        while (i < j) {
            while (i <= j && pivot <= lo)
                i++;
            while (i <= j && pivot > hi)
                j--;
            
            
            if (i < j) {
                int temp = list[j];
                list[j] = list[i];
                list[i] = temp;
            }
        }

        while (j > lo && list[j] >= pivot) 
            j--;

        if (pivot >= list[j]) {
            list[lo] = list[j];
            list[j] = pivot;
            return j;
        } 
        else
            return lo;
    }
}