package dataStructures.o3_Queue.Hard;

public class bfs_numOfIslands {

    public static void main(String[] args) {
        bfs_numOfIslands obj = new bfs_numOfIslands();

        char[][] grid = new char[][]{{'1'}, {'1'}};
            /*{'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}};*/
    
     int n = obj.numIslands(grid);
    System.out.println("numIslands: "+ n);
}

    public int numIslands(char[][] grid) {

        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int numOfIslands = 0;

        if (grid.length == 0 || grid[0].length == 0) return 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '0')
                    continue;

                if (visited[i][j])
                    continue;

                if (grid[i][j] == '1')
                    numOfIslands++;

                checkForIsland(grid, i, j, visited);

            }
        }
        return numOfIslands;
    }

    private void checkForIsland(char[][] grid, int i, int j, boolean[][] visited){
        if (i <0 || j < 0 || i >= grid.length || j >= grid[0].length)
            return;

        if (grid[i][j] == '0')
            return;

        if (visited[i][j])
            return;

        visited[i][j] = true;
        checkForIsland(grid, i+1, j, visited);
        checkForIsland(grid, i-1, j, visited);
        checkForIsland(grid, i, j+1, visited);
        checkForIsland(grid, i, j-1, visited);

    }
}
