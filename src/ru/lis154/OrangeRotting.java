package ru.lis154;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class OrangeRotting {

    public static void main(String[] args) {
        int[][] mas= new int[][] {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(mas));
    }

    public static int orangesRotting(int[][] grid) {
        int totalOranges = 0;
        int rottenOranges = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        ArrayList<int[]> rottenLocations = new ArrayList<>();
        boolean[][] visited = new boolean[rows][cols];

        //Find all rotten oranges
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                if(grid[r][c] == 1)
                    totalOranges+=1;

                if(grid[r][c] == 2){
                    rottenLocations.add(new int[] {r,c});
                    rottenOranges+=1;
                    totalOranges+=1;
                }
            }
        }
        for (int[] m: rottenLocations) {
            for (int i = 0; i < m.length; i++) {
                System.out.println(m[i]);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        for(int[] i : rottenLocations){
            q.add(i);
        }

        int minute = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                int[] loc = q.poll();
                int r = loc[0];
                int c = loc[1];

                //If location was a fresh orange, update # of rotten oranges and add its neighbors
                if(!visited[r][c] && grid[r][c] > 0){
                    if(grid[r][c] == 1)
                        rottenOranges += 1;

                    if(r>0)
                        q.add(new int[] {r-1,c});
                    if(c>0)
                        q.add(new int[] {r,c-1});
                    if(r<rows-1)
                        q.add(new int[] {r+1,c});
                    if(c<cols-1)
                        q.add(new int[] {r,c+1});
                }

                visited[r][c] = true;
            }

            if(rottenOranges >= totalOranges)
                return minute;

            minute += 1;
        }

        return (rottenOranges >= totalOranges) ? minute : -1;
    }
}
