package ru.lis154;

import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println(letterCombinations(""));

//        Main main = new Main();
//        main.test(new int[]{1, 2, 3});
//
//        System.out.println(main.leng("sdf sdf sdfsdf sdfsdf sdfsdf "));
        //System.out.println(main.generateParenthesis(4));
        int[] arr = {1, 2, 3, 4, 4, 4, 5, 6, 7};
        int[] arr2 = {2,2};
        int index = SearchList.binarySearch(arr2, 2);
        Integer[] mas = SearchList.getArrayIndex(arr2, index);
        int[] indexes;

        if (mas[0] == -1) indexes = new int[]{-1, -1};
        else if (mas.length == 1) indexes = new int[]{mas[0], mas[0]};
        else indexes = new int[]{mas[0], mas[mas.length-1]};
        for (int i = 0; i < indexes.length; i++) {
            System.out.println(indexes[i]);
        }
        System.out.println();




    }

    public static List<String> letterCombinations(String digits) {
        if (!(digits.matches("[-+]?\\d+"))) return new ArrayList<String>();
        Map<String, List<String>> map = new HashMap<>();
        map.put("2", Arrays.asList(new String[]{"a", "b", "c"}));
        map.put("3", Arrays.asList(new String[]{"d", "e", "f"}));
        map.put("4", Arrays.asList(new String[]{"g", "h", "i"}));
        map.put("5", Arrays.asList(new String[]{"j", "k", "l"}));
        map.put("6", Arrays.asList(new String[]{"m", "n", "o"}));
        map.put("7", Arrays.asList(new String[]{"p", "q", "r", "s"}));
        map.put("8", Arrays.asList(new String[]{"t", "y", "v"}));
        map.put("9", Arrays.asList(new String[]{"w", "x", "u", "z"}));

        String[] str = digits.split("");
        List<String> first = new ArrayList<>();
        List<String> last = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (first.size() == 0) {
                for (int j = 0; j < (map.get(str[i])).size(); j++) {
                    first.add(map.get(str[i]).get(j));
                }
                continue;
            }
            if (first.size() != 0){
                for (int j = 0; j < first.size(); j++) {
                    for (int k = 0; k < (map.get(str[i])).size(); k++) {
                        last.add(first.get(j) + map.get(str[i]).get(k));
                    }
                }
                first = last;
                last = new ArrayList<>();
            }
        }
        return first;
    }

    public void pair(int kol){
        Stack<String> stack = new Stack<>();
        for (int i=0; i<kol; i++){
            stack.push("(");
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recursion(n, n, "", res);
        return res;
    }
    void recursion(int left, int right, String out, List<String> res) {
        System.out.println("left " + left + " right " + right);
        if (left < 0 || right < 0 || left > right) return;
        if (left == 0 && right == 0) {
            System.out.println(res);
            res.add(out);
            return;
        }
        recursion(left - 1, right, out + "(", res);
        recursion(left, right - 1, out + ")", res);
    }

    public void nextPermitation(int[] nums){
        int ch = returnInt(nums);

    }

    public int returnInt(int[] nums){
        String ch = "";
        for (int i = 0; i < nums.length; i++) {
            ch = ch + nums[i];
        }
        return Integer.parseInt(ch);
    }

    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }

    static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public void test(int[] nums){
        int[] arr = nums;
        if (nums.length == 1) System.out.println(nums);
        int nachChislo = returnInt(nums);
        int rez = 0;
        int min = nachChislo;
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        int shift = max;
        while (count > 0) {
            int t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            if (rez == 0) {
                if (returnInt(arr) > nachChislo) rez = returnInt(arr);
            } else if (returnInt(arr) > nachChislo && returnInt(arr) < rez) {
                rez = returnInt(arr);
            }
            if(returnInt(arr) < nachChislo && returnInt(arr) < min){
                min = returnInt(arr);
            }
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
        if (rez != 0){
            nums = preobr(rez);
            print(nums);

        } else { print(preobr(min));
            nums = preobr(min);
            print(nums);
        }
        // return rez;
    }

    public int[] preobr (int x){
        String s = Integer.toString(x);
        int[] arr = new int[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            arr[i] = x % 10;
            x /= 10;
        }
        return arr;
    }

    public int leng(String s){
        String[] str = s.split(" ");
        return (str[str.length-1]).length();
    }




}
