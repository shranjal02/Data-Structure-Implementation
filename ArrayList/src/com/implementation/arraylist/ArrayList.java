package com.implementation.arraylist;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * An dynamic implementation of ArrayList class which provides most commonly
 * used functionalities such as add, remove, contains and size.
 * 
 * @author Prakhar Shrivastava
 */
public class ArrayList<E> implements ArrayListInterface<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    /*
     * Custom ArrayList Constructor which intializes ArrayList with default
     * capacity.
     */
    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /*
     * add method takes an element as argument and appends new element at the last
     * of the arraylist.
     */
    public void add(E e) {
        if (size == elements.length) {
            growArrayCapacity();
        }
        elements[size++] = e;
    }

    /*
     * remove method takes an element as argument and removes the first occurence of
     * that element from index 0.
     * First it finds the index of that element, if it doesn't find the element then
     * it throws NoSuchElementException.
     * If it finds the index of that element the it shifts all the elements from the
     * value of idx by 1 and reduces the arraylist size by 1.
     */
    public void remove(E e) {
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            throw new NoSuchElementException(ArrayListConstants.NO_ELEMENT_FOUND);
        }

        for (int i = idx; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;
    }

    /*
     * 
     * returns current size of the arraylist.
     */
    public int size() {
        return size;
    }

    /*
     * contains method takes an element as argument and uses an utility method
     * called indexOf which return the index of the element if that element is
     * present in arraylist otherwise -1.
     */
    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    // Common utility methods
    public int indexOf(E e) {
        for (int i = size - 1; i >= 0; i--)
            if (elements.equals(elements[i]))
                return i;

        return -1;
    }

    private void growArrayCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    @Override
    public String toString() {
        return "ArrayList [elements=" + Arrays.toString(Arrays.stream(elements)
                .filter(s -> (s != null && elements.length > 0))
                .toArray()) + ", size=" + size + "]";
    }

}
