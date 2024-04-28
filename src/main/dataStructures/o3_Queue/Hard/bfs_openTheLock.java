package dataStructures.o3_Queue.Hard;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
//INCOMPLETE
public class bfs_openTheLock {

    public static void main(String[] args) {

    String[] deadends = {"8888"};
    String target = "0009";

}

    public int openLock(String[] deadends, String target) {
        int numOfMoves =0;
        int level = 0;

        HashSet<String> deadEndsSet = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet();
        Queue<String> queue = new LinkedList();

        if (deadEndsSet.contains("0000") || deadEndsSet.contains(target))
            return -1;


        visited.add("0000");
        queue.offer("0000");

        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String curr = queue.poll();
                numOfMoves++;
                if (curr.equals(target)) return numOfMoves;
            }
        }
        level++;

        return numOfMoves;
    }


}
