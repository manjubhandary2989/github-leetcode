package com.mshetty.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
    public static void main(String[] args) {
        int result = sherlockAndAnagrams("cdcd");
        System.out.println("Result: " + result);
    }

    public static int sherlockAndAnagrams(String s){

        int start = 0;
        int end = start+1;
        int n = s.length();
        int counter=0;
        HashMap<String, Integer> map= new HashMap<>();

        while(start < n){
            char[] c = s.substring(start, end).toCharArray();
            Arrays.sort(c);

            String temp = String.valueOf(c);

            if(!map.containsKey(temp)){
                map.put(temp, 1);
            } else {
                int freq = map.get(temp);
                map.put(temp, freq+1);
                counter += freq;
            }

            end++;
            if(end > n){
                start++;
                end = start+1;
            }
        }

        return counter;
//        int start = 0 ; int end = start + 1; int strLength = s.length(); int counter = 0;
//        HashMap<String,Integer> str = new HashMap<>();
//        while(start < strLength){
//            char[] c = s.substring(start,end).toCharArray();
//            Arrays.sort(c);
//            String temp = String.valueOf(c);
//            System.out.println("Temp: " +temp);
//
//            if(!str.containsKey(temp))
//                str.put(temp, 1);
//            else{
//                int freq = str.get(temp);
//                counter += freq;
//                str.put(temp, freq + 1);
//            }
//            end++;
//            if(end > strLength){
//                start++;
//                end = start + 1;
//            }
//        }
//        return counter;
    }


}
