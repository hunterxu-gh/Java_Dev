/**
 * MergeSort
 * 核心： 分治、递归
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] list = {2, 3, 3, 5, -6, 1, -2, 14, -12};
        mergeSort(list);
        for (int var : list) {
            System.out.print(var + " ");
        }
    }

    // Core1： 分
    public static void mergeSort(int[] list) {
        // 只有在长度为2以上的数组才有被归并的意义
        if (list.length > 1) {
            // 拆（divide）：新建第一个数组，装填待排序数组的前一半
            int[] firstHalf = new int[list.length / 2];
            // System.arraycopy的用法含首不含尾
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            // 对前一半待排序数组进行递归的归并排序（注意mergeSort中已经包含了拆、排、组）
            mergeSort(firstHalf);

            // 注意后一半数组的长度和起止位置
            int restLength = list.length - list.length / 2;
            int[] secondHalf = new int[restLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, restLength);

            mergeSort(secondHalf);

            // 排和组（sort & merge）：当程序执行到这一条语句的时候，待排序数组中的所有元素都被拆分成单个元素了，下面开始进行【判断大小】和【装填元素】到新的数组
            merge(firstHalf, secondHalf, list);
        }
    }

    // Core2: 治
    public static void merge(int[] firstHalf, int[] secondHalf, int[] temp) {
        int currentIndexOf1Half = 0;
        int currentIndexOf2Half = 0;
        int currentIndexOfTemp = 0;

        // 开始判断大小，并依次装填数组
        // 在各自的索引没有超过各自的数组长度的情况下
        while (currentIndexOf1Half < firstHalf.length && currentIndexOf2Half < secondHalf.length) {
            // 如果数组1中的元素小于数组2中的元素
            if (firstHalf[currentIndexOf1Half] < secondHalf[currentIndexOf2Half])
                temp[currentIndexOfTemp++] = firstHalf[currentIndexOf1Half++];
            else
                temp[currentIndexOfTemp++] = secondHalf[currentIndexOf2Half++];
        }

        // list1和list2判断完毕后，如果有多余的元素（原始待排序数组的长度为奇数），则将剩余的元素全部依次装入新数组（一般情况只会有0和1两种情况，如果大于1，则早就被拆分了）
        // 如果数组1的索引还没有到达数组1的长度，则认为是数组1中还有剩余元素
        while (currentIndexOf1Half < firstHalf.length)
            temp[currentIndexOfTemp++] = firstHalf[currentIndexOf1Half++];

        while (currentIndexOf2Half < secondHalf.length)
            temp[currentIndexOfTemp++] = secondHalf[currentIndexOf2Half++];
    }
}