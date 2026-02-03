package integer.stack.manager;

import java.util.LinkedList;

/**
 * IntegerStack handles the LIFO (Last-In, First-Out) data structure logic.
 * We use 'final' to prevent inheritance and maintain the integrity of the stack logic.
 */
final class IntegerStack {
    // We use LinkedList as the underlying Collection because it allows O(1)
    // insertion and removal at the head of the list, which perfectly mimics a Stack.
    private LinkedList<Integer> list = new LinkedList<>();

    /**
     * Logic for Push (Add):
     * We add the element to the 'First' position of the LinkedList.
     * This ensures the most recent element is always at index 0 (the top).
     */
    public void push(int element) {
        list.addFirst(element);
        System.out.println(">>> Pushed " + element + " onto the stack.");
    }

    /**
     * Logic for Pop (Remove):
     * First, we must check if the stack has elements to avoid exceptions.
     * If not empty, we remove the first element (index 0).
     * Returns null if empty, or the Integer value of the removed top element.
     */
    public Integer pop() {
        if (isEmpty()) {
            return null; // Return null to allow the caller to handle empty state gracefully
        }
        return list.removeFirst();
    }

    /**
     * Logic for Empty Check:
     * Utilizes the Collection's built-in isEmpty() method.
     * Returns true if the size is 0.
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * Logic for Display:
     * Iterates through the list and prints it.
     * Because we use addFirst(), the list naturally prints from Top to Bottom.
     */
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Current Stack (Top to Bottom): " + list);
        }
    }
}