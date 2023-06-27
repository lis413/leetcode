package ru.lis154;

import java.util.List;

public class CountAndSay {
    public static void main(String[] args) {
        System.out.println(countAndSay(552223448));
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(3322251));
    }
    public static String countAndSay(int n) {
        String[] s = String.valueOf(n).split("");
        if (s.length == 1) return s[0];
        StringBuilder rez = new StringBuilder();
        int count = 0;
        String prom = s[0];
        for (String st : s){
            if (prom.equals(st)){
                count++;
            } else {
                rez.append(count);
                rez.append(prom);
                count = 1;
                prom = st;

            }
        }
        rez.append(count);
        rez.append(prom);
        return rez.toString();
    }

    class Prom{
        int number;
        int count;
        public Prom(int number, int count) {
            this.number = number;
            this.count = count;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
