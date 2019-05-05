import java.util.Collection;
import java.util.Iterator;

public interface Tree<E> extends Collection<E> {

    public boolean delete(E e);

    public int getSize();

    public default void inorder() {

    }

    public default void postorder() {}

    public default void preorder() {}

    
    @Override
    public default int size() {
        return getSize();
    }

    @Override
    public default boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public default boolean contains(Object o) {
        return search((E)e);
    }

    @Override
    Iterator<E> iterator();

    @Override
    Object[] toArray();

    @Override
    <T> T[] toArray(T[] a);

    @Override
    boolean add(E e);

    @Override
    public default boolean remove(Object o) {
        return delete((E)e);    
    }

    @Override
    boolean containsAll(Collection<?> c);

    @Override
    boolean addAll(Collection<? extends E> c);

    @Override
    boolean removeAll(Collection<?> c);

    @Override
    boolean retainAll(Collection<?> c);

    @Override
    boolean equals(Object o);

    @Override
    int hashCode();
}
