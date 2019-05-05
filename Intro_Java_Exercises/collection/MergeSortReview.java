/**
 * MergeSortReview
 */
public class MergeSortReview {

    public static void main(String[] args) {
        int[] list = {2, 3, 3, 5, -6, 1, -2, 14, -12};
        mergeSort(list);
        for (int var : list) {
            System.out.print(var + " ");
        }
    }

    public static void mergeSort(int[] list) {
        // 分
        if (list.length <= 1) return; // 注意处理递归基
        int[] firstHalf = new int[list.length / 2];
        System.arraycopy(list, 0, firstHalf, 0, list.length/2);
        mergeSort(firstHalf);

        int secondHalfLength = list.length - list.length / 2;
        int[] secondHalf = new int[secondHalfLength];
        System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength); // 注意list2中的元素起止位置
        mergeSort(secondHalf);

        merge(firstHalf, secondHalf, list);
    }

    public static void merge(int[] list1, int[] list2, int[] list3) {
        int index1 = 0, index2 = 0, index3 = 0;

        while (index1 < list1.length && index2 < list2.length) {
            if (list1[index1] < list2[index2])
                list3[index3++] = list1[index1++];
            else
                list3[index3++] = list2[index2++];
            }
            
        while (index1 < list1.length)
            list3[index3++] = list1[index1++];
            
        while (index2 < list2.length)
            list3[index3++] = list2[index2++];
            
    }
}