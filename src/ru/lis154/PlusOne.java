package ru.lis154;

import java.util.Stack;

public class PlusOne {

    public static void main(String[] args) {
        int[] t = new int[]{1,2,3};
        int[] t2 = new int[]{9};
        plusOne(t2);
    }
    public static int[] plusOne(int[] digits) {
        if(digits.length == 0) return digits;
        Stack<Integer> stack = new Stack<>();
        int rez = digits[digits.length - 1] + 1 == 10 ? 1 : 0;
        if (rez == 0) {
            digits[digits.length - 1] =  digits[digits.length - 1] + 1;
            return digits;
        }
        stack.push(0);
        for (int i = digits.length - 2; i >= 0; i--){
            if (digits[i] + rez == 10){
                rez = 1;
                stack.push(0);
            } else {
                stack.push(digits[i] + rez);
                rez = 0;
            }
        }
        if (rez == 1) stack.push(1);
        int[] masRez = new int[stack.size()];
        int c = 0;
        while(!stack.empty()){
            masRez[c] = stack.pop();
            c++;
        }
        return masRez;
    }
}
