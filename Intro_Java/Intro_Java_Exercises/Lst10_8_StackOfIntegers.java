package Intro_Java_Exercises;

/**
 * Lst10_8_StackOfIntegers
 */
public class Lst10_8_StackOfIntegers {

    private int[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public Lst10_8_StackOfIntegers() {
        this(DEFAULT_CAPACITY); // ??
    }

    public Lst10_8_StackOfIntegers(int capacity) {
        elements = new int[capacity]; // ??
    }

    // ??
    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size]; //??
    }

    public int peek() {
        return elements[size - 1]; // ??
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}