///**
// * Name: Connor Morrison
// * NSID: tvi340
// * Student Number: 11374770
// * Course: CMPT 270 Section 01
// */
//
//import java.util.LinkedList;
//
///**
// * Generic Stack class implementing the StackOperations interface
// * @param <I> the type of elements in the stack
// */
//public class Stack<I> implements StackOperations<I> {
//    private LinkedList<I> stackLinkedList;
//
//    /**
//     * Constructor for the Stack class
//     */
//    public Stack() {
//        stackLinkedList = new LinkedList<>();
//    }
//
//    /**
//     * Adds an item to the top of the stack
//     * @param item the item to be added to the stack
//     * @throws IllegalArgumentException if the item is null
//     */
//    public void push(I item) {
//        if (item == null) {
//            throw new IllegalArgumentException("Cannot push a null item.");
//        }
//        stackLinkedList.addLast(item);
//    }
//
//    /**
//     * Removes an item from the top of the stack
//     * @throws IllegalStateException if the stack is empty
//     */
//    public void pop() {
//        if (stackLinkedList.isEmpty()) {
//            throw new IllegalStateException("Cannot pop an empty stack.");
//        }
//        stackLinkedList.removeLast();
//    }
//
//    /**
//     * Returns the item at the top of the stack without removing it
//     * @return the item at the top of the stack
//     * @throws IllegalStateException of the stack is empty
//     */
//    public I peek() {
//        if (stackLinkedList.isEmpty()) {
//            throw new IllegalStateException("Cannot peek an empty stack.");
//        }
//        return stackLinkedList.getLast();
//    }
//
//    /**
//     * Returns the number of items in the stack
//     * @return the number of items in the stack
//     */
//    public int size() {
//        return stackLinkedList.size();
//    }
//
//    /**
//     * Returns a boolean whether the stack is empty
//     * @return true if the stack is empty, false otherwise
//     */
//    public boolean isEmpty() {
//        return stackLinkedList.isEmpty();
//    }
//
//    /**
//     * Returns a string representation of the stack vertically
//     * @return a string representation of the stack vertically
//     */
//    public String toString() {
//        String result = "";
//        for (int i = stackLinkedList.size() - 1; i >= 0; i--) {
//            result += stackLinkedList.get(i) + "\n";
//        }
//        return result;
//    }
//
//    /**
//     * Main method to test Stack class
//     * @param args testing arguments
//     */
//    public static void main(String[] args) {
//        // Regression test for 'Stack()'
//        Stack<Integer> stack = new Stack<>();
//        if (stack.stackLinkedList == null) {
//            System.out.println("Error: constructor is not creating a new LinkedList");
//        }
//
//        // Regression test for 'push()'
//        stack.push(1);
//        if (stack.stackLinkedList.getLast() != 1) {
//            System.out.println("Error: push not adding element correctly");
//        }
//        if (stack.stackLinkedList.size() != 1) {
//            System.out.println("Error: stackLinkedList not correct size after pushing 1 element");
//        }
//
//        stack.push(2);
//        stack.push(3);
//
//        if (stack.stackLinkedList.get(0) != 1) {
//            System.out.println("Error: push not adding elements 2,3 correctly");
//        }
//        if (stack.stackLinkedList.get(1) != 2) {
//            System.out.println("Error: push not adding elements 2,3 correctly");
//        }
//        if (stack.stackLinkedList.get(2) != 3) {
//            System.out.println("Error: push not adding elements 2,3 correctly");
//        }
//        if (stack.stackLinkedList.size() != 3) {
//            System.out.println("Error: stackLinkedList not correct size after pushing 2,3");
//        }
//
//        // Regression test for 'peek()'
//        if (stack.peek() != 3) {
//            System.out.println("Error: peek not returning the top element in the stack");
//        }
//
//        // Regression test for 'pop()'
//        stack.pop();
//        if (stack.stackLinkedList.size() != 2) {
//            System.out.println("Error: size not correct after popping an element");
//        }
//        if (stack.stackLinkedList.getLast() != 2) {
//            System.out.println("Error: pop did not remove correct element from stack");
//        }
//
//        stack.pop();
//        if (stack.stackLinkedList.size() != 1) {
//            System.out.println("Error: size not correct after popping two elements");
//        }
//        if (stack.stackLinkedList.getLast() != 1) {
//            System.out.println("Error: pop did not remove correct element from stack");
//        }
//
//        // Regression test for 'size()'
//        if (stack.size() != 1) {
//            System.out.println("Error: size not returning correct number of elements in Stack of size 1");
//        }
//        stack.pop();
//        if (stack.size() != 0) {
//            System.out.println("Error: size not returning correct number of elements in empty Stack");
//        }
//
//        // Regression test for 'isEmpty()'
//        if (!stack.isEmpty()) {
//            System.out.println("Error: isEmpty not returning true for empty Stack");
//        }
//        stack.push(9);
//        if (stack.isEmpty()) {
//            System.out.println("Error: isEmpty not returning false for non-empty Stack");
//        }
//
//        // Regression test for 'toString()'
//        stack.push(7);
//        stack.push(100);
//        stack.push(72);
//        stack.push(3);
//
//        System.out.println("toString() output:\n" + stack.toString());
//
//        // Testing exceptions
//
//        // Testing pop on empty stack
//        stack = new Stack<>();
//        try {
//            stack.pop();
//            System.out.println("Error: pop not throwing exception on empty stack");
//        } catch (IllegalStateException e) {
//            // Expected exception
//        }
//
//        // Testing peek on empty stack
//        try {
//            stack.peek();
//            System.out.println("Error: peek not throwing exception on empty stack");
//        } catch (IllegalStateException e) {
//            // Expected exception
//        }
//
//        // Testing push null item
//        try {
//            stack.push(null);
//            System.out.println("Error: push not throwing exception when pushing null item");
//        } catch (IllegalArgumentException e) {
//            // Expected exception
//        }
//    }
//}
