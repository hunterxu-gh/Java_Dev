/**
 * InsertSortReview
 */
public class InsertSortReview {

    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -3};
        insertSort(list);
        for (int var : list) {
            System.out.print(var + " ");
        }
    }

    public static void insertSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int curElement = list[i];
            int k;
            for (k = i - 1; k >=0 && list[k] > curElement; k--) {
                list[k + 1] = list[k];
            }            
            list[k + 1] = curElement;
        }
    }
}