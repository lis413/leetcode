package ru.lis154;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(addDigits(23));
    }
    public static int addDigits(int num) {
        while (num > 9){
            String[] str = String.valueOf(num).split("");
            num = 0;
            for (String s : str){
                num += Integer.parseInt(s);
            }
        }
        return num;
    }

    public int addDugut2(int num){
        int rez = num;
        while(true){
            rez = num;
            if(num>=0&&num<=9) return num;
            int sum = 0;
            while(rez!=0){
                int t = rez%10;
                sum+=t;
                rez/=10;
            }
            num = sum;
        }
    }
}
