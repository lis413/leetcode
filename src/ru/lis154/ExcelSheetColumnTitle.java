package ru.lis154;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.printf(convertToTitle(236645487));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0)
        {
            columnNumber--;
            char c = (char)(columnNumber % 26 + 'A');
            sb.append(c);
            columnNumber /= 26;
        }
        return sb.reverse().toString();

    }
}
