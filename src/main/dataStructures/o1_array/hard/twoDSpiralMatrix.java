package dataStructures.o1_array.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoDSpiralMatrix {
    public static void main(String[] args) {
        twoDSpiralMatrix s = new twoDSpiralMatrix();

        int[][] inputMatrix = new int[][]{{1,2,3,4},{5,6,7,8}, {9,10,11,12}};  //{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};  //// {{1,2}, {3,4}};

        System.out.println("Given Matrix: ");
        Arrays.stream(inputMatrix).forEach(row ->
        {
            Arrays.stream(row).forEach(col -> System.out.print(col + ","));
            System.out.println("");
        });

        List<Integer> results = s.spiralOrder(inputMatrix);

        System.out.println("Resultant  Matrix: ");
        Arrays.stream(results.toArray()).forEach(n -> System.out.print(n + ","));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        java.util.List<Integer> results = new ArrayList<>();

        int colBegin = 0;
        int rowBegin = 0;
        int colEnd = matrix[0].length -1;
        int rowEnd = matrix.length -1;

        while (colBegin <= colEnd && rowBegin <= rowEnd) {
            //Traverse Right
            for (int i = colBegin; i <= colEnd; i++) {
                results.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            //Traverse Down
            for (int i = rowBegin; i <= rowEnd ; i++) {
                results.add(matrix[i][colEnd]);
            }
            colEnd--;

            //Traverse Left
            if (rowBegin <= rowEnd)
                for (int j = colEnd; j >= colBegin ; j--) {
                    results.add(matrix[rowEnd][j]);
                }
            rowEnd--;

            //Traverse Top
            if (colBegin <= colEnd)
                for (int i = rowEnd; i >= rowBegin ; i--) {
                    results.add(matrix[i][colBegin]);
                }
            colBegin++;
        }

            /*while (row )
            switch (direction)
            {
                case "right":
                    col++;
                    if (col < n - 1)
                        direction = "right";
                    else
                        direction = "bottom";
                    break;
                case "bottom":
                    row++;
                    if (row < m - 1)
                        direction = "bottom";
                    else
                        direction = "left";
                    break;
                case "left":
                    col--;
                    if (col > 0)
                        direction = "left";
                    else
                        direction = "top";
                    break;
                case "top":
                    row--;

                    if(col == 0 && row == 0) {
                        row++;
                        col++;
                        direction = "right";
                    }
                    else {
                        if (row > 0)
                            direction = "top";
                        else
                            direction = "right";
                    }
                    break;
            }*/
       // }

        return results;

    }
}
