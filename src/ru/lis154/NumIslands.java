package ru.lis154;

public class NumIslands {

    public static void main(String[] args) {

    }
    public int numIslands(char[][] grid) {
        int countIsland = 0;
        for (int i =0; i < grid.length; i++){
            for (int j =0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    countIsland++;
                    obhod(grid, i, j);
                }
            }
        }
        return countIsland;
    }

    static void obhod(char[][] grid, int row, int col){
        grid[row][col] = '2';
        if (row > 0 && grid[row-1][col] == '1'){
            obhod(grid, row-1, col);
        }
        if (row < grid.length-1 && grid[row+1][col] == '1'){
            obhod(grid, row+1, col);
        }
        if (col > 0 && grid[row][col-1] == '1'){
            obhod(grid, row, col-1);
        }
        if (col < grid[0].length -1  && grid[row][col+1] == '1'){
            obhod(grid, row, col+1);
        }
        return;
    }


}
