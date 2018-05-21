package com.codecool.dynamicArrayDojo;


// put your code here!
public class DynamicIntArray {
    public static final int DEFAULT_ARRAY_SIZE = 10;

    private int[] array;
    private int size;
    private int pointer;

    public DynamicIntArray() {
        this(DEFAULT_ARRAY_SIZE);
    }
    public DynamicIntArray(int arraySize) {
        this.array = new int[arraySize];
        this.size = arraySize;
        this.pointer = 0;
    }

    public void add(int element) {
        if(pointer < size) {
            array[pointer++] = element;
        } else {
            int[] temp = array;
            extendArray();
            System.arraycopy(temp, 0, array, 0, temp.length);
            add(element);
        }

    }

    public void remove(int element) {
    }

    public void insert(int index, int element) {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int element: array) {
            sb.append(" " + element);
        }
        return sb.toString();
    }

    private void extendArray() {
        int newSize = array.length + 1;
        this.array = new int[newSize];
        this.size = newSize;
    }
}
