package ru.lis154;

public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++){
            int[] mas = new int[image[i].length];
            int k = 0;
            for (int j = image[i].length-1; j >= 0; j--){
                mas[k] = image[i][j] == 1 ? 0 : 1;
                k++;
            }
            image[i] = mas;
        }
        return image;
    }
}
