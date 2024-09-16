package cz.cvut.fel.pjv;

import java.util.NoSuchElementException;

/**
 * Implementation of the {@link Queue} backed by fixed size array.
 */
public class CircularArrayQueue implements Queue {

    /**
     * Creates the queue with capacity set to the value of 5.
     */
    private String[] array;
    private int maxSize = 5;
    private int front;
    private int rear;
    private int count = 0;

    public CircularArrayQueue() {
        array = new String[maxSize];
    }


    /**
     * Creates the queue with given {@code capacity}. The capacity represents maximal number of elements that the
     * queue is able to store.
     *
     * @param capacity of the queue
     */
    public CircularArrayQueue(int capacity) {
        maxSize = capacity;
        array = new String[maxSize];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        if(count == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        if(count == maxSize) {
            return true;
        }
        return false;
    }

    @Override
    public boolean enqueue(String obj) {
        if (isFull()) {
            return false;
        }
        array[rear] = obj;
        rear = (rear + 1) % maxSize;
        count++;
        return true;
    }

    @Override
    public String dequeue() {
        if (isEmpty()) {
           return null;
        }
        String first = array[front];
        front = (front + 1) % maxSize;
        count--;
        return first;
    }

    public int getSize() {
        return (rear + maxSize - front) % maxSize;
    }

    @Override
    public void printAllElements() {
            for (int i = front; i < count + front; i++) {
                System.out.println(array[i % maxSize]);
            }
        }
}