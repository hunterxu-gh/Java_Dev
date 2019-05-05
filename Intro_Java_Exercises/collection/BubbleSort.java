/**
 * BubbleSort
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] list = {3, 5, 7, 3, 2, -6};
        bubbleSort(list);
        for (int var : list) {
            System.out.print(var + " ");
        }
    }

    public static void bubbleSort(int[] list) {
        // flag标签，用于确定是否需要下一次冒泡操作（数组是否已经排好序）
        boolean needNextBubble;
        // k用来控制循环次数，i用来表示数组的索引index
        for (int k = 1; k < list.length; k++) {
            needNextBubble = false;
            // 每次内循环过后，必定有一个大数被移动至末尾排好序，所以下一次i循环的长度可以减少1次，随着k的增加，i也不断减少，所以问题规模被缩减至list.length-k
            for(int i = 0; i < list.length - k; i++) {
                // 这里也可以使用list[i]和list[k]比较
                if(list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    // 当if条件成立时，代表着数组未排好序，所以上面会对元素进行一次交换，并需要下一次循环来检测整个数组是否排好序
                    needNextBubble = true;
                }
            }
        }
    }
}