package Intro_Java_Exercises;

import java.util.ArrayList;

/**
 * Lst11_10_MyStack
 */
public class Lst11_10_MyStack {

    private ArrayList<Object> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o = list.get(getSize - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public push(Object o) {
        list.add(getSize() - 1 , o);
        // list.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}