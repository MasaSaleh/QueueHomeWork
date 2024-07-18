package queuehomework;

import java.util.Scanner;

public class QueueHomeWork {
    public static <T> void swap(MyQueue<T> qu, int x, int y) {
        T a = null, b = null;
        int size = qu.size;
        if (x > size || y > size || x < 0 || y < 0 || x == y) {
            return;}
        
        for (int i = 0; i < size; i++) {
            T val = qu.dequeue();
            if (i == x) {
                a = val;}
            else if (i == y) {
                b = val;}
            qu.enqueue(val);}
        
        for (int i = 0; i < size; i++) {
            T val = qu.dequeue();
            if (i == x) {
                qu.enqueue(b); } 
            else if (i == y) {
                qu.enqueue(a);}
            else {
                qu.enqueue(val);}}}
            

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        MyQueue<Integer> qu = new MyQueue<>();
        int x,y;
        qu.enqueue(11);
        qu.enqueue(22);
        qu.enqueue(33);
        qu.enqueue(44);
        qu.enqueue(55);
        System.out.println("Masa Rafiq Saleh:::202211397");
        System.out.println("************************");
        System.out.println(qu);
        System.out.println("************************");
        System.out.print("Enter e1 : ");
        x=in.nextInt();
        System.out.print("Enter e2 : ");
        y=in.nextInt();
        System.out.println("************************");
        swap(qu, x, y);
        System.out.println(qu);}}

    
