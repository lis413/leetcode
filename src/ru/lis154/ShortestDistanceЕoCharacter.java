package ru.lis154;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceЕoCharacter {
    public static void main(String[] args) {
        shortestToChar("loveleetcode", 'e');
    }

    public static int[] shortestToChar(String s, char c) {

        int n = s.length();
        int[] arr = new int[n];
        int c_position = -n;

        for (int i = 0; i < n; i++) {
            if(s.charAt(i) == c){
                c_position = i;
            }
            arr[i] = i - c_position;
        }

        for (int i = n-1; i >= 0; i--) {
            if(s.charAt(i) == c){
                c_position = i;
            }
            arr[i] = Math.min(arr[i], Math.abs(i - c_position));
        }
        return arr;
    }
}
