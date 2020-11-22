package com.mshetty;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] s = {"flower","flow","flight"};
        String[] s1= {"dog","racecar","car"};
        String[] s2 = {"aa","a"};
        String result = longestCommonPrefix(s2);
        System.out.println("Result: " +result);
    }

//    public static String longestCommonPrefix(String[] strs) {
//        //sanity check
//        if(strs.length == 0)
//            return "";
//
//        if(strs.length == 1)
//            return strs[0];
//
//        if(strs[0].length() == 0)
//            return "";
//
//        int n=strs[0].length();
//        int i=0;
//        boolean isCommon = false;
//        String res="";
//        while(i<n){
//            char c=strs[0].charAt(i);
//            for(int j=1; j<strs.length;j++){
//                if((i<strs[j].length()) && c == strs[j].charAt(i)){
//                    isCommon = true;
//
//                } else {
//                    isCommon = false;
//                    break;
//                }
//            }
//
//            if(isCommon == true){
//                i++;
//                res += c+"";
//            } else{
//                break;
//            }
//
//        }
//        return res;
//    }

//    public static String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0)
//            return "";
//
//        Arrays.sort(strs);
//        for(String s:strs) {
//            System.out.println(s);
//        }
//        String first = strs[0];
//        String last = strs[strs.length - 1];
//        int c = 0;
//        while(c < first.length())
//        {
//            if (first.charAt(c) == last.charAt(c))
//                c++;
//            else
//                break;
//        }
//        return c == 0 ? "" : first.substring(0, c);
//    }

    public static String longestCommonPrefix(String[] strs) {
        char[] chars = strs[0].toCharArray();
        String res = "";
        boolean prefix = true;

        for(int j=0; j<chars.length; j++){
            for(int i=1; i < strs.length; i++){
                if(strs[i].length() > j && chars[j] == strs[i].charAt(j)) {
                    prefix = true;
                } else {
                    prefix = false;
                    break;
                }
            }
            if(prefix)
                res += chars[j];
            else
                break;
        }
        return res;
    }


}
