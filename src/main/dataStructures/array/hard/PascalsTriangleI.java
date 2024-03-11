package dataStructures.array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleI {
    public static void main(String[] args) {
        PascalsTriangleI s = new PascalsTriangleI();

        int num = 5;

        System.out.println("Given num: " + num);

        List<List<Integer>> results = s.generate(num);

        Arrays.stream(results.toArray()).forEach(n -> System.out.print(n + ","));

    }

    public List<List<Integer>> generate(int numRows) {
        List<Integer> prevRow = new ArrayList<>();
        List<List<Integer>> prevRows = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
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
            prevRows.add(prevRow);
            System.out.println("");
        }
        return prevRows;

    }
}
