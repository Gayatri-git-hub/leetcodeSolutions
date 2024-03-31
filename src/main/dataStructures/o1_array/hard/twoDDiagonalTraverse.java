package dataStructures.o1_array.hard;

import java.util.Arrays;

public class twoDDiagonalTraverse {
    public static void main(String[] args) {
        twoDDiagonalTraverse s = new twoDDiagonalTraverse();

        int[][] inputMatrix = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}; // {{1,2}, {3,4}};

        System.out.println("Given Matrix: ");
        Arrays.stream(inputMatrix).forEach(row ->
        {
            Arrays.stream(row).forEach(col -> System.out.print(col + ","));
            System.out.println("");
        });

        int[] results = s.findDiagonalOrder(inputMatrix);

        System.out.println("Resultant  Matrix: ");
        Arrays.stream(results).forEach(n -> System.out.print(n + ","));
    }

    public int[] findDiagonalOrder(int[][] mat) {
        if (mat.length == 0 || mat[0].length ==0)
            return new int[0];

        int m = mat.length;
        int n = mat[0].length;

        int[] results = new int[m * n];

        int i = 0;
        int row = 0;
        int col = 0;

        boolean goUp = true;

        while (row < m && col < n){
            // 1. if diagonal is going UP
            if (goUp)
            {
                while (row > 0 && col < n-1){
                    results[i++] = mat[row][col];
                    row--;
                    col++;
                }
                results[i++] = mat[row][col];
                if (col == n-1)
                    row++;
                else
                    col++;
            }
            // 2. going DOWN
            else {
                while (col >0 && row < m-1){
                    results[i++] = mat[row][col];
                    col--;
                    row++;
                }
                results[i++] = mat[row][col];
                if (row == m-1)
                    col++;
                else
                    row++;
            }

            goUp = !goUp;
        }
        //-----------------------------------------------
        /*int[] results = new int[2 * 2];
        int m = 2; //rows count
        int n = 2; // col count


        int maxIncr = m;

        boolean colIncr = false;
        int counter = 1;
        int resultIdx =0;
        //Start
        int row = 0;
        int col = 0;

        int i=0;
        //for (int i = 0; i < results.length; i++) {
        while (i < results.length) {

            for (int r = 0; r <= row; r++) {
                for (int c = 0; c <= col; c++) {
                    if ((r + c) == i) {
                        results[i++] = mat[r][c];
                    }
                }
            }

            if (colIncr == true)
                colIncr = false;
            else
                colIncr = true;

            if (colIncr & col < mat[0].length)
                col++;
            else {
                if (row < mat.length)
                   row++;
            }
        }*/

        return results;

    }
}
