package ru.lis154;

public class MaxAreOfIsland {

    public static void main(String[] args) {
       int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},
               {0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
       maxAreaOfIsland(grid);

    }

    public static int maxAreaOfIsland(int[][] grid) {
        int[][] max = new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(findS(grid, i, j, 0, new boolean[grid.length][grid[0].length], max));
                System.out.println("    " +  max[i][j]);
            }
        }
        return 0;
    }


    private static int findS (int[][] grid, int sr, int sc, int summ, boolean[][] isDone, int[][] rez){
        if (sr < 0 || sr >= grid.length || sc < 0 || sc >= grid[0].length || grid[sr][sc] != 1 || isDone[sr][sc] == true){
            return summ;
        }
        summ++;
        rez[sr][sc] = summ;
        isDone[sr][sc] = true;
        findS(grid, sr-1, sc, summ, isDone, rez);
        findS(grid, sr+1, sc, summ, isDone, rez);
        findS(grid, sr, sc-1, summ, isDone, rez);
        findS(grid, sr, sc+1, summ, isDone, rez);
        return summ;
    }
}
