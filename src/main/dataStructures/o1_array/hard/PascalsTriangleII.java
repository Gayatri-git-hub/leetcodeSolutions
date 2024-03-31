package dataStructures.o1_array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {
        PascalsTriangleII s = new PascalsTriangleII();

        int num = 5;

        System.out.println("Given num: " + num);

        List<Integer> results = s.getRow(num);

        Arrays.stream(results.toArray()).forEach(n -> System.out.print(n + ","));

    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> prevRow = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            Integer[] row = new Integer[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row[j] = 1;
                    System.out.print(row[j] + " ");
                } else {
                    row[j] = prevRow.get(j - 1) + prevRow.get(j) ;
                    System.out.print(row[j] + " ");
                }
            }
            prevRow = Arrays.asList(row) ;
            System.out.println("");
        }
        return prevRow;

    }
}
