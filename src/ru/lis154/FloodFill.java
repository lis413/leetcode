package ru.lis154;

public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (color == oldColor) return image;
        fill(image, sr, sc, color, oldColor);
        return image;
    }


    void fill(int[][] image, int sr, int sc, int color, int oldColor){
        if (sr < 0 || sc < 0 || sc >= image[0].length || sr >= image.length || image[sr][sc] != oldColor){
            return;
        }
        image[sr][sc] = color;
        fill(image, sr+1, sc, color, oldColor);
        fill(image, sr, sc+1, color, oldColor);
        fill(image, sr-1, sc, color, oldColor);
        fill(image, sr, sc-1, color, oldColor);

    }

}
