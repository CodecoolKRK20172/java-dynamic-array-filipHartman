package com.codecool.dynamicArrayDojo;


// put your code here!
public class DynamicIntArray {
    public static final int DEFAULT_ARRAY_SIZE = 10;

    private int[] array;
    private int size;

    public DynamicIntArray() {
        this.array = new int[DEFAULT_ARRAY_SIZE];
        this.size = 0;
    }
    public DynamicIntArray(int arraySize) {
        this.array = new int[arraySize];
        this.size = 0;
    }

    public void add(int element) {
        if(size < array.length) {
            array[size++] = element;
        } else {
            int[] temp = array;
            extendArray();
            for (int tempElement : temp) {
                add(tempElement);
            }
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
        this.array = new int[array.length + 1];
        this.size = 0;
    }
}
