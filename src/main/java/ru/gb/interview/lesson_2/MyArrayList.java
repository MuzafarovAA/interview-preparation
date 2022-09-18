package ru.gb.interview.lesson_2;

import java.util.*;

public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENT_DATA = {};
    private static final Object[] DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA = new Object[DEFAULT_CAPACITY];
    public static final double GROW_MULTIPLICATION = 1.5;
    private int size = 0;
    private Object[] elementData;


    public MyArrayList() {
        this.elementData = DEFAULT_CAPACITY_EMPTY_ELEMENT_DATA;
    }

    public MyArrayList(int capacity) {
        if (capacity > 0) {
            this.elementData = new Object[capacity];
        } else if (capacity == 0) {
            this.elementData = EMPTY_ELEMENT_DATA;
        } else {
            throw new IllegalArgumentException(String.format("Illegal capacity = %s", capacity));
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean add(E e) {
        if (size == elementData.length) {
            grow();
        }
        elementData[size] = e;
        size++;
        return true;
    }

    private void grow() {
        elementData = Arrays.copyOf(elementData, (int) (elementData.length * GROW_MULTIPLICATION));
    }

    public boolean remove(int index) {
        indexValidate(index);
        for (int i = index; i < size; i++) {
            elementData[i] = elementData[i + 1];
        }
        size--;
        return true;
    }

    public boolean remove(Object o) {
        if (!contains(o)) {
            throw new IllegalArgumentException("No such element");
        }
        return remove(indexOf(o));
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public Object get(int index) {
        indexValidate(index);
        return elementData[index];
    }

    private void indexValidate(int index) {
        if ((index > size) || (index < 0)) {
            throw new IllegalArgumentException(String.format("Illegal index = %s", index));
        }
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", elementData=" + Arrays.toString(elementData) +
                '}';
    }

}
