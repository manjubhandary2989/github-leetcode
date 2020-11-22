//package com.mshetty.strings;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class LC3_LongestSubstring {
//    public static int lengthOfLongestSubstring(String s) {
////        char[] chars = s.toCharArray();
////        int result=0;
////
////        for(int i=0; i<chars.length; i++){
////            Map<Character, Integer> map = new HashMap<>();
////            map.put(chars[i], 1);
////            int count=1;
////
////            for(int j=i+1; j<chars.length; j++){
////                if(map.getOrDefault(chars[j], 0) == 0) {
////                    map.put(chars[j], 1);
////                    count++;
////                    result = Math.max(result, count);
////                }
////                else{
////                    result = Math.max(result, count);
////                    break;
////                }
////            }
////
////        }
////
////        return result;
//
//        Set<Character> set = new HashSet<>();
//        int n = s.length();
//
//        int i=0; int j=0;
//        int result = 0;
//
//        while(i<n && j<n){
//            if(!(set.contains(s.charAt(j)))){
//                set.add(s.charAt(j++));
//                result = Math.max(result, j-i);
//            } else {
//                set.remove(s.charAt(i++));
//            }
//
//
//        }
//    }
//
//    public static void main(String[] args) {
//       String s = "au";
//               //"abcabcbb";
//        System.out.println("res: " + lengthOfLongestSubstring(s));
//    }
//
//
//    }
