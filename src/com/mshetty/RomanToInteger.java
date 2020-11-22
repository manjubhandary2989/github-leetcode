package com.mshetty;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class RomanToInteger {
    public static void main(String[] args) {
        int result = romanToInt("IV");
        System.out.println("Result: " +result);
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int value = map.get(s.charAt(i));
            if(i+1 < s.length() && value < map.get(s.charAt(i+1))){
                sum -= value;
            } else {
                sum += value;
            }
        }
        return sum;


    }

//    public static int romanToInt(String s) {
//        char[] c = s.toCharArray();
//        int sum = 0;
//        for (int i = 0; i < c.length; i++) {
//            switch (c[i]) {
//                case 'M':
//                    sum += 1000;
//                    break;
//                case 'D':
//                    sum += 500;
//                    break;
//                case 'C':
//                    if (i + 1 < c.length && (c[i + 1] == 'D' || c[i + 1] == 'M')) {
//                        sum -= 100;
//                    } else {
//                        sum += 100;
//                    }
//                    break;
//                case 'L':
//                    sum += 50;
//                    break;
//                case 'X':
//                    if (i + 1 < c.length && (c[i + 1] == 'L' || c[i + 1] == 'C')) {
//                        sum -= 10;
//                    } else {
//                        sum += 10;
//                    }
//                    break;
//                case 'V':
//                    sum += 5;
//                    break;
//                case 'I':
//                    if (i + 1 < c.length && (c[i + 1] == 'V' || c[i + 1] == 'X')) {
//                        sum -= 1;
//                    } else {
//                        sum += 1;
//                    }
//                    break;
//            }
//        }
//        return sum;


//    public static int romanToInt(String s){
//        Map<String, Integer> map = new HashMap<>();
//           map.put("M", 1000);
//           map.put("CM", 900);
//           map.put("D", 500);
//           map.put("CD", 400);
//           map.put("C", 100);
//           map.put("XC", 90);
//           map.put("L", 50);
//           map.put("XL", 40);
//           map.put("X", 10);
//           map.put("IX", 9);
//           map.put("V", 5);
//           map.put("IV", 4);
//           map.put("I", 1);
//
//        int result=0;
//        int n = s.length();
//        int i=0;
//
//        while(i<n){
//            if(i+1 < n) {
//
//
//                int val = (int) map.get(s.charAt(i)+"");
//                int valNext = (int) map.get(s.charAt(i+1)+"");
//
//                if (val < valNext) {
//                    if (map.get((s.charAt(i)+""+ s.charAt(i+1))) != null) {
//                        result += (int) map.get(s.charAt(i)+"" + s.charAt(i+1)+"");
//                        i = i + 2;
//                    }
//                } else {
//                    result += (int) map.get(s.charAt(i)+"");
//                    i++;
//                }
//            }
//            if(i<n) {
//                int finalVal = map.get(s.charAt(i) + "");
//                result += finalVal;
//            }
//        }
//
//        return result;


}
