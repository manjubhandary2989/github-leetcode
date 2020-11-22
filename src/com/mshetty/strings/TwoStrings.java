package com.mshetty.strings;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String result = twoStrings(s1, s2);
        System.out.println(result);
    }

    public static String twoStrings(String s1, String s2) {

        char[] s1Array = s1.toCharArray();
        Set<Character> set = new HashSet<>();
        for(int i=0; i<s1.length(); i++){
            set.add(s1.charAt(i));
        }

        for(int i=0; i<s2.length(); i++){
            if(set.contains(s2.charAt(i)))
                return "YES";
        }
        return "NO";

//        for(int i=0; i<s1.length(); i++){
//            for(int j=0; j<s2.length(); j++){
//                if(s1.charAt(i) == s2.charAt(j))
//                    return "YES";
//            }
//        }
//
//        return "NO";



    }

}
