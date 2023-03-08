package ru.lis154;


import java.util.Collection;

public class floodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image[sr][sc] == newColor) return image;
        changeNeigbors(image, sr, sc, image[sr][sc], newColor);
        return image;

    }

    public static void changeNeigbors(int[][] image, int sr, int sc, int color, int newColor){
       if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color){
           return;
       }
       image[sr][sc] = newColor;
       changeNeigbors(image, sr-1, sc, color, newColor);
        changeNeigbors(image, sr+1, sc, color, newColor);
        changeNeigbors(image, sr, sc-1, color, newColor);
        changeNeigbors(image, sr, sc+1, color, newColor);
    }

}
