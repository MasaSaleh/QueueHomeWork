package queuehomework;

public class MyQueue<E> {

    E arr[];
    int front, rear, size;

    public MyQueue() {
        arr = (E[]) new Object[5];
        front = rear = -1;
        size = 0;}
    

    public void enqueue(E val) {
        if (rear == arr.length - 1) {
            E b[] = (E[]) new Object[arr.length * 2];
            for (int i = 0, j = front; j <= rear; i++, j++) {
                b[i] = arr[j];}
            
            rear -= front;
            front = 0;
            arr = b;}
        
        if (isEmpty()) {
            front = 0;}
        
        rear++;
        arr[rear] = val;
        size++;}

    

    public E peek() {
        if (isEmpty()) {
            return null;}
        else {
            return arr[front];}}
        

    public boolean isEmpty() {
        return front == -1;}
    

    public E dequeue() {
        if (isEmpty()) {
            return null; } 
        else {
            E val = arr[front];
            front++;
            if (front > rear) {
                front = rear = -1;}
            size--;
            return val;}}

    @Override
    public String toString() {
        String s = "[";
        for (int i = front; i <= rear; i++) {
            s += arr[i];
            if (i != rear) {
                s += " ,";}}
        return s + "]";}}
    