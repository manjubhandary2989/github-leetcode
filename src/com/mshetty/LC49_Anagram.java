package com.mshetty;

import java.util.*;

public class LC49_Anagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);
        for(List<String> res: result){
            for(String s:res){
                System.out.print(s + ", ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs){
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String curStr = String.valueOf(chars);

            if(!map.containsKey(curStr))
                map.put(curStr, new ArrayList<String>());

            map.get(curStr).add(strs[i]);
        }

        return new ArrayList<>(map.values());


    }

//    public static List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> result = new ArrayList<>();
//
//        if(strs.length == 0)
//            return result;
//
//        boolean[] checked = new boolean[strs.length];
//
//        for(int i=0; i<strs.length-1; i++){ //eat
//            List<String> tempList = new ArrayList<>();
//
//            if(!checked[i])
//                tempList.add(strs[i]); //eat
//            else
//                continue;
//
//           // while((j<strs.length) && (!checked[j])){
//            for(int j=i+1; j<strs.length; j++){
//                if(!checked[j] && compareStrings(strs[i], strs[j])){
//                    tempList.add(strs[j]);
//                    checked[j] = true;
//                }
//            }
//            result.add(tempList);
//
//        }
//
//
//       if(!checked[checked.length-1]){
//           List<String> aList = new ArrayList<>();
//           aList.add(strs[strs.length-1]);
//           result.add(aList);
//       }
//
//       return result;
//    }
//
//    public static boolean compareStrings(String str1, String str2){
//        char[] charArray1 = str1.toCharArray();
//        Arrays.sort(charArray1);
//
//        char[] charArray2 = str2.toCharArray();
//        Arrays.sort(charArray2);
//
//        if(charArray1.length == charArray2.length){
//            for(int i=0; i<charArray1.length; i++){
//                if(!(charArray1[i] == charArray2[i])){
//                    return false;
//                }
//            }
//        } else{
//            return false;
//        }
//        return true;
//    }
}
