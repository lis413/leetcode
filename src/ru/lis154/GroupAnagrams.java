package ru.lis154;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
        String[] strs2 = new String[]{""};
        String[] strs3 = new String[]{"a"};

        System.out.println(groupAnagrams(strs).toString());
        System.out.println(groupAnagrams(strs2).toString());
        System.out.println(groupAnagrams(strs3).toString());
    }
    public List<List<String>> groupAnagrams2(String[] strs) {
        List<List<String>> res = new LinkedList();
        Map<String, List<String>> anagramsMap = new HashMap();
        for(int i=0; i< strs.length; i++){
            String tmpStr = strs[i];
            String[] tmpStrArr = tmpStr.split("");
            Arrays.sort(tmpStrArr);
            String sortedString = String.join("", tmpStrArr);
            if(anagramsMap.containsKey(sortedString)){
                anagramsMap.get(sortedString).add(strs[i]);
            }else{
                List<String> stringList = new LinkedList();
                stringList.add(strs[i]);
                anagramsMap.put(sortedString, stringList);
            }
        }
        for(String str: anagramsMap.keySet()){
            res.add(anagramsMap.get(str));
        }
        return res;
    }


    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Set<Integer> udal = new HashSet<>();
        for (int i = 0; i < strs.length; i++) {
            List<String> str = new ArrayList<>();
            if (!udal.contains(i)) {
                str.add(strs[i]);
                for (int j = i + 1; j < strs.length; j++) {
                    udal.add(i);
                    if (compareAnagram(strs[i], strs[j])) {
                        udal.add(j);
                        str.add(strs[j]);
                    }
                }
                list.add(str);
            }
        }
        return list;
    }

    public static boolean compareAnagram(String str, String str2){
        if (str.length() != str2.length()) return false;
        Map<Character, Integer> mapStr = strToMap(str);
        Map<Character, Integer> mapStr2 = strToMap(str2);
        return mapStr.equals(mapStr2);
    }
    
    public static Map<Character, Integer> strToMap(String str){
        char[] charStr = str.toCharArray();
        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < charStr.length; i++) {
            if (map.containsKey(charStr[i])){
                map.put(charStr[i], map.get(charStr[i]) + 1);
            } else {
                map.put(charStr[i], 1);
            }
        }
        return map;
    }
}
