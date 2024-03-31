package dataStructures.o3_Queue.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImplementQueue {

    private List<Integer> data;
    private int pointer;

    public ImplementQueue(){
        data = new ArrayList<>();
        pointer = 0;
    }

    public void enqueue(int num){
        System.out.println("Adding number to the queue. Index: " + pointer);
        data.add(num);
        return;
    }

    public int dequeue(){
        System.out.println("Removing item # " + pointer + "from queue");
        return data.get(pointer++);
    }
    public static void main(String[] args) {
        ImplementQueue s = new ImplementQueue();



    }

    public int[] twoSum(int[] numbers, int target) {

        int sum =0;
        int[] result = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length ; j++) {
                sum = numbers[i] + numbers[j];
                if (sum > target)
                    break;
               // System.out.println("Sum of index i: " + i + " and j: " + j + " = " + sum);
                if (sum == target) {
                    result[0] = i + 1;
                    result[1] = j + 1;
                    return result;
                    }
                }
            }
        return result;

    }
}
