package com.paypay.sdechallenge;

public interface Queue<T> {
    Queue<T> enQueue(T t);

    Queue<T> deQueue();

    T head();

    boolean isEmpty();
}