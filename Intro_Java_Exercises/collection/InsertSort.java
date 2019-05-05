/**
 * InsertSort
 * 核心：前缀有序，后缀无序，通过迭代来一步一步的移动元素位置
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] list = {1, 9, 4, 6, 5, -3};
        insertSort(list);
        for (int var : list) {
            System.out.print(var + " ");
        }
    }

    public static void insertSort(int[] list) {
        // 外层循环，负责对整个数组进行扫描，可以默认第一个元素即list[0]是sorted list，所以从list[1]排起
        for (int i = 1; i < list.length; i++) {
            // 取当前的元素list[i]，将其与之前的[0, i-1]个元素对比，如果比其中的元素k小，则开始将[k, i-1]个元素依次向后移动1位来腾出位置给currentElement(list[i])
            int currentElement = list[i];
            // 哨兵，用来定位比currentElement小的那个元素
            int k;
            // 从第[i-1]个元素开始，依次向前扫描，直到找到那个比currentElement小的元素，临界点是k=0, 定位点是list[k] <= currentElement
            // 循环停止的条件有两个：1是k递减至0也没能找到比currentElement大的元素，2是找到了list[k] <= currentElement，此时list[k]比currentElement小了，所以要把currentElement放在k+1的位置， 即list[k+1] = currentElemnt
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                // 开始将[k, i-1]个元素依次向后移动1位来腾出位置给currentElement(list[i])
                list[k+1] = list[k];
            }
            // 将currentElement放入刚才腾出来的位置
            list[k+1] = currentElement;
        }
    }
}