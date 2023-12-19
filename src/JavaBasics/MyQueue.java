package JavaBasics;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {
     final LinkedList<T> myqueue = new LinkedList<>();// Напишите свое решение ниже

    public void enqueue(T element){
        myqueue.add(element);// Напишите свое решение ниже

    }

    public T dequeue(){
        return myqueue.poll();// Напишите свое решение ниже
    }

    public T first(){
        return myqueue.peek();// Напишите свое решение ниже

    }

    public LinkedList<T> getElements() {

        return  myqueue;// Напишите свое решение ниже

    }
}
