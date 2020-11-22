package com.mshetty.strings;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LC30_SubstringConcatenation {
    public static void main(String[] args) {

    }

    public static List<Integer> findSubstring(String s, String[] words){
        int n = s.length();
        int num = words.length;
        int wLen = words[0].length();

        Map<String, Integer> counts = new HashMap<>();

        for(String word : words){
            counts.put(word, counts.getOrDefault(word, 0)+1);
        }

        List<Integer> resultList = new LinkedList<>();

        for(int i=0 ;i<n-num*wLen+1; i++){
            Map<String, Integer> seen = new HashMap<>();
            int j=0;
            String subStr = s.substring(i + j*wLen, i+(j+1)*wLen);
            while(j<num){
                if(counts.containsKey(subStr)){
                    seen.put(subStr, seen.getOrDefault(subStr, 0)+1);
                    if(seen.get(subStr) > counts.getOrDefault(subStr, 0)){
                        break;
                    }
                } else {
                    j++;
                }
            }

            if(j==num)
                resultList.add(i);
        }

    return resultList;

    }

//    public static List<Integer> findSubstring(String s, String[] words) {
//
//        if(s.length() == 0 || words.length == 0)
//            return null;
//
//        int n=s.length();
//        int num = words.length;
//        int wLen = words[0].length();
//
//        Map<String, Integer> counts = new HashMap<>();
//
//        for(int k=0; k<wLen; k++) {
//            counts.put(words[k], counts.getOrDefault(words[k],0)+1);
//        }
//        List<Integer> result = new LinkedList<>();
//
//        for(int i = 0; i < n - num*wLen + 1; i++){
//            Map<String, Integer> seen = new HashMap<>();
//            int j=0;
//            while(j<num){
//                String subStr = s.substring(i + j*wLen, i + (j+1) * wLen);
//                if(counts.containsKey(subStr)){
//                    seen.put(subStr, seen.getOrDefault(subStr, 0)+1);
//                    if(seen.get(subStr) > counts.getOrDefault(subStr,0)) {
//                        break;
//                    }
//                } else {
//                    break;
//                }
//            j++;
//            }
//            if(j == num){
//                result.add(i);
//            }
//        }
//
//        return result;
//
//    }

}
