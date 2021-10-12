package ru.lis154;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
            //  System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int[][] matrix2 = new int[matrix.length][matrix.length];
        for (int i = matrix.length-1; i >= 0; i--) {
            int nach = matrix.length - i - 1;
            for (int j = 0; j < matrix.length; j++) {
                matrix2[j][nach] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix[i][j] = matrix2[i][j];
            }
        }
    }
}
