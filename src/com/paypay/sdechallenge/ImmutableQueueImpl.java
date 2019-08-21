package com.paypay.sdechallenge;

import jdk.jfr.Description;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableQueueImpl<T> implements Queue<T> {

    private final List<T> queue;

    //Primary contructor
    public ImmutableQueueImpl() {
        queue = new ArrayList<>();
    }

    //Copy Constructor for Deep Copy
    private ImmutableQueueImpl(ImmutableQueueImpl<T> obj) {
        this.queue = new ArrayList<>(obj.queue);
    }

    @Override
    @Description("Enqueue")
    public Queue<T> enQueue(T value) {
        ImmutableQueueImpl<T> copyQueue = null;
        copyQueue = new ImmutableQueueImpl<>(this);
        copyQueue.queue.add(value);
        return copyQueue;
    }

    @Override
    @Description("Dequeue")
    public Queue<T> deQueue() {
        ImmutableQueueImpl<T> copyQueue = null;
        copyQueue = new ImmutableQueueImpl<>(this);
        try {
            copyQueue.queue.remove(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("com.paypay.sdechallenge.Queue is Empty:" + e.getMessage());
        }
        return copyQueue;
    }

    @Override
    @Description("Peek")
    public T head() {
        try {
            return this.queue.get(0);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("com.paypay.sdechallenge.Queue is Empty:" + e.getMessage());
        }
        return null;
    }

    @Override
    @Description("com.paypay.sdechallenge.Queue empty or not")
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
}
