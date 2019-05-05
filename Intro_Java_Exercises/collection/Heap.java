import java.util.ArrayList;

/**
 * Heap
 */

//  使用泛型结构
public class Heap <E extends Comparable<E>> {

    // 使用ArrayList来实现一个堆结构
    private ArrayList list = new ArrayList<>();

    // 无参构造
    public Heap() {}
    
    // 带参构造，使用泛型
    public Heap(E[] objects) {
        for (int var : objects) {
            add(objects[var]);
        }
    }

    // 对堆进行增添元素操作，分为两步：
    // 1. 将新的元素添加至堆的末尾
    // 2. 检查该元素是否满足堆结构（该元素的值是否大于其父节点，如果是，则做上浮操作（对调）直至满足堆结构）
    public void add(E object) {
         // 1. 将新的元素添加至堆的末尾
        list.add(object); // append to the heap

         // 2. 检查该元素是否满足堆结构（该元素的值是否大于其父节点，如果是，则做上浮操作（对调）直至满足堆结构）
        int currentIndex = list.size() - 1; // the index of the last node(new object)
        // 给检查器一个入口条件currentIndex > 0 即list.size() > 1，即list存在除根节点外的至少1个节点
        // 循环的目的是为了不断地检查，从新元素的父节点直到根节点
        while(currentIndex > 0) {
            // 根据二叉树的性质取堆的父节点坐标
            int parentIndex = (currentIndex - 1) / 2;
            // list.get(currentIndex)代表新插入的元素
            // list.get(parentIndex)代表其父节点
            // 该表达式 > 0表示新元素的值大于其父节点的值，则做交换操作（上浮）
            if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, parentIndex);
                list.set(parentIndex, temp);
            }
            // 若新插入的元素满足堆结构，则退出检查器（while循环）
            else break;
        }
    }

    // 堆中元素的删除操作（删除根节点）：
    // 1. 将根节点与末尾节点对换
    // 2. 删除末尾节点
    // 3. 重新恢复堆结构的稳定性（对根节点做下沉操作）
    public E remove() {
        // 对平凡情况进行处理
        if(list.size() == 0) return null;

        // 取根节点，保存在名为removeObject的变量中
        E removeObject = list.get(0);
        // 取末尾元素坐标
        int endNodeIndex = list.size() - 1;
        // 末尾元素的值替换根节点
        list.set(0, list.get(endNodeIndex));
        // 删除末尾元素
        lsit.remove(endNodeIndex);
        // 以上四步操作便将根节点保存到removeObject中，将末尾元素放入根节点，再删除末尾元素，完成根节点的“删除”和末尾元素成“伪”根的操作

        // 下面开始对堆进行重构（根节点下沉，恢复稳定结构）
        // 首先要找到根节点左右孩子中较大的那一个，然后将“伪”根节点与其交换（永远保证根节点最大，父节点大于子节点）
        // 初始化“伪”根节点坐标
        int currentIndex = 0;
        // while用于控制循环从“伪”根节点下沉至末尾节点，当currentIndex超出堆的尺寸后即认为已到达末尾
        while (currentIndex < list.size()) {
            // 根据二叉树的性质求左右孩子的坐标
            int leftChildIndex = currentIndex * 2 + 1;
            int rightChildIndex = currentIndex * 2 + 2;

            // leftChildIndex >= list.size()认为已达到末尾，则无需进行任何交换操作
            if (leftChildIndex >= list.size()) break;
            // 暂且设左孩子节点未最大值的坐标
            int maxIndex = leftChildIndex;
            // 如果右孩子节点还在堆内
            if (rightChildIndex < list.size()) {
                // 如果右孩子的值大于左孩子，则交换最大值的坐标
                if(list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0) {
                    maxIndex = rightChildIndex;
                }
            }

            // 比较“伪”根节点和孩子节点的值，如果“伪”根节点的值小于孩子节点，则做交换（记住交换的前提是上一步找出“更大”的孩子节点操作）
            if(list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                E temp = list.get(maxIndex);
                lsit.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                // 更新“伪”根节点的坐标，进行下一轮的下沉检测和操作
                currentIndex = maxIndex;
            }
            // 如果“伪根节点”的值大于其孩子节点，则认为树已稳定
            else break;
        }
        // 返回删除的对象，类似栈的pop操作
        return removeObject;
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
}