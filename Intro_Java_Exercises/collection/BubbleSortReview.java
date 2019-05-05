/**
 * BubbleSortReview
 */
public class BubbleSortReview {

    public static void main(String[] args) {
        int[] list = {3, 5, 9, 21, 100, -12, 5, 7, 3, 2, -6};
        bubbleSort(list);
        for (int var : list) {
            System.out.print(var + " ");
        }
    }

    public static void bubbleSort(int[] list) {
        boolean ifNextBubble;
        for(int k = 1; k < list.length; k++) {
            ifNextBubble = false;
            for (int i = 0; i < list.length-1; i++) {
                if(list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    ifNextBubble = true;
                }
            }
        }
    }
}