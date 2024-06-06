/**
 * Name: Connor Morrison
 * NSID: tvi340
 * Student Number: 11374770
 * Course: CMPT 270 Section 01
 */

import java.util.LinkedList;

/**
 * Generic Stack class implementing the StackOperations interface
 * @param <I> the type of elements in the stack
 */
public class Stack<I> implements StackOperations<I> {
    private LinkedList<I> stackLinkedList;

    /**
     * Constructor for the Stack class
     */
    public Stack() {
        stackLinkedList = new LinkedList<>();
    }

    /**
     * Adds an item to the top of the stack
     * @param item the item to be added to the stack
     * @throws IllegalArgumentException if the item is null
     */
    public void push(I item) {
        if (item == null) {
            throw new IllegalArgumentException("Cannot push a null item.");
        }
        stackLinkedList.addLast(item);
    }

    /**
     * Removes an item from the top of the stack
     * @throws IllegalStateException if the stack is empty
     */
    public void pop() {
        if (stackLinkedList.isEmpty()) {
            throw new IllegalStateException("Cannot pop an empty stack.");
        }
        stackLinkedList.removeLast();
    }

    /**
     * Returns the item at the top of the stack without removing it
     * @return the item at the top of the stack
     * @throws IllegalStateException of the stack is empty
     */
    public I peek() {
        if (stackLinkedList.isEmpty()) {
            throw new IllegalStateException("Cannot peek an empty stack.");
        }
        return stackLinkedList.getLast();
    }

    /**
     * Returns the number of items in the stack
     * @return the number of items in the stack
     */
    public int size() {
        return stackLinkedList.size();
    }

    /**
     * Returns a boolean whether the stack is empty
     * @return true if the stack is empty, false otherwise
     */
    public boolean isEmpty() {
        return stackLinkedList.isEmpty();
    }

    /**
     * Returns a string representation of the stack
     * @return a string representation of the stack
     */
    public String toString() {
        return stackLinkedList.toString();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // Regression test for 'Stack()'
        Stack<Integer> stack = new Stack<>();

        // Regression test for 'push()'
        stack.push(1);
        stack.push(2);
        stack.push(3);
        if

        // Regression test for 'pop()'

        // Regression test for 'peek()'

        // Regression test for 'size()'

        // Regression test for 'isEmpty()'

        // Regression test for 'toString()'
    }
}
