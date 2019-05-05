import java.util.ArrayList;

/**
 * HeapReview
 */
public class HeapReview <E extends Comparable<E>> {

    private ArrayList list = new ArrayList<>();

    public Heap() {}

    public Heap(E[] objects) {
        for (int var : objects) {
            add(objects[var]);
        }
    }

    public void add(E e) {
        list.add(e);

        int currentIndex = list.size() - 1;
        while(currentIndex > 0) {
            int parentIndex = (currentIndex - 1) * 2;

            if (list.get(currentIndex).compareTo(list.get(parentIndex)) > 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(parentIndex));
                list.set(parentIndex, temp);
                currentIndex = parentIndex;
            }
        }
    }

    public E remove() {
        if(list.size() == 0) return null;

        E removeElement = list.get(0);
        int endNodeIndex = list.size() - 1;
        list.set(0, endNodeIndex);
        list.remove(endNodeIndex);

        int currentIndex = 0;
        while (currentIndex < list.size()) {
            int lChildIndex = currentIndex * 2 + 1;
            int rChildIndex = currentIndex * 2 + 2;

            if (lChildIndex >= list.size()) break;
            int maxIndex = lChildIndex;
            if (rChildIndex < list.size()) {
                if (list.get(lChildIndex).compareTo(list.get(rChildIndex)) < 0) {
                    maxIndex = rChildIndex;
                }
            }

            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0) {
                E temp = list.get(currentIndex);
                list.set(currentIndex, list.get(maxIndex));
                list.set(maxIndex, temp);
                currentIndex = maxIndex;
            }
        }

        return removeElement;
    }

    public int getSize() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

}