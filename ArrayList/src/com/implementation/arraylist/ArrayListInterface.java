package com.implementation.arraylist;

/**
 * This interface contains declaration of all the methods which will be
 * available to use in arraylist class.
 */
public interface ArrayListInterface<T> {
    public void add(T ele);

    public void remove(T ele);

    public boolean contains(T ele);

    public int size();
}
