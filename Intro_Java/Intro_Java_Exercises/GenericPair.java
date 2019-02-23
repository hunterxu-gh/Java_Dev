/**
 * GenericPair
 */
public class GenericPair<U, V> {
    private U obj1;
    private V obj2;

    public GenericPair(U obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public U getObj1 () {
        return obj1;
    }

    public V getObj2 () {
        return obj2;
    }

    public static void main(String[] args) {
        GenericPair<String,Integer> pair = new GenericPair<String,Integer>("Hello", 1);
    }
}