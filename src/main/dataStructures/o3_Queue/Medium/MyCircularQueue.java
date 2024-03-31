package dataStructures.o3_Queue.Medium;

import java.util.ArrayList;
import java.util.List;

class MyCircularQueue {

    private int[] data;
    private int size;
    private int head;
    private int tail;

    public static void main(String args[]){
        //Your MyCircularQueue object will be instantiated and called as such:
        MyCircularQueue obj = new MyCircularQueue(3);
        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.enQueue(2);
        boolean param_3 = obj.enQueue(3);
        boolean param_4 = obj.enQueue(4);

        int param_5 = obj.Rear();
        boolean param_6 = obj.isFull();

        boolean param_7 = obj.deQueue();
        boolean param_8 = obj.enQueue(4);
        int param_9 = obj.Rear();


    }
    public MyCircularQueue(int k) {
        data = new int[k];
        size = k;
        head = -1;
        tail = -1;
    }

    public boolean enQueue(int value) {
        if (isFull())
            return false;
        if (isEmpty())
            head =0;
        tail = (tail + 1) % size;
        data[tail] = value;
        return true;
    }

    public boolean deQueue() {
        if (isEmpty())
            return false;
        if (head == tail)
        {
            head =-1;
            tail =-1;
            return true;
        }
        head = (head + 1) % size;
        return true;
    }

    public int Front() {
        if (isEmpty())
            return -1;
        return data[head];
    }

    public int Rear() {
        if (isEmpty())
            return -1;
        return data[tail];
    }

    public boolean isEmpty() {
        return (head == -1);
    }

    public boolean isFull() {
        return ((tail + 1) % size) == head;
    }
}


