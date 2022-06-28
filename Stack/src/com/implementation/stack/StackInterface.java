
package com.implementation.stack;

/**
 * This interface contains declaration of all the methods which will be
 * available to use in stack class.
 */
public interface StackInterface<T> {
    public void push(T ele);

    public void pop();

    public T peek();

    public boolean isEmpty();
}
