package com.mshetty;

import java.util.*;

public class LetterCombinationsofPhoneNumber {
    public static void main(String[] args) {
        List<String> resultList = new ArrayList<>();
        resultList = letterCombinations("234");
        System.out.println(resultList);
    }

    public static List<String> letterCombinations(String digits) {
        String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String> resultList = new ArrayList<>();
        resultList.add("");

        //sanity check
        if(digits.length() == 0)
            return resultList;

        for(int i=0; i<digits.length(); i++){
            int pos = (int) digits.charAt(i) - '0';
            String str = map[pos];
            resultList = combine(str, resultList);
        }
        return resultList;

    }

    public static List<String> combine(String str, List<String> curList){
        List<String> result = new ArrayList<String>();

        for(int i=0; i<str.length(); i++){
            for(String x : curList)
                result.add(str.charAt(i) + x);
        }

        return result;


    }
//        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
//        List<String> result = new ArrayList<String>();
//
//        if (digits.length()==0) return result;
//
//        result.add("");
//        for (int i=0; i<digits.length(); i++) {
//            System.out.println("Here: " + digitletter[digits.charAt(i) - '0']);
//            result = combine(digitletter[digits.charAt(i) - '0'], result);
//        }
//
//        return result;
//    }
//
//    public static List<String> combine(String digit, List<String> l) {
//        List<String> result = new ArrayList<String>();
//
//        for (int i=0; i<digit.length(); i++)
//            for (String x : l) {
//                result.add(x + digit.charAt(i));
//                System.out.println("Added: "+ x + digit.charAt(i));
//            }
//
//        return result;
//    }


//        Map<String, List<String>> map = new HashMap<>();
//        map.put("2",new ArrayList<String> (Arrays.asList("a", "b", "c")));
//        map.put("3", new ArrayList<String> (Arrays.asList("d", "e", "f")));
//        map.put("4", new ArrayList<String> (Arrays.asList("g", "h", "i")));
//        map.put("5", new ArrayList<String> (Arrays.asList("j", "k", "l")));
//        map.put("6", new ArrayList<String> (Arrays.asList("m", "n", "o")));
//        map.put("7", new ArrayList<String> (Arrays.asList("p", "q", "r", "s")));
//        map.put("8", new ArrayList<String> (Arrays.asList("t", "u", "v")));
//        map.put("9", new ArrayList<String> (
//        Arrays.asList("w", "x", "y", "z")));
//
//
//        //sanity check
//        if(digits.length() == 1)
//            return map.get(digits);
//
//        List<String> result = new ArrayList<>();
//
//        int n=digits.length();
//        for(int i=0; i<n-1; i++){
//            String s = digits.charAt(i)+"";
//            List<String> firstList = map.get(s);
//
//            for(int j=0; j<firstList.size(); j++){
//                System.out.println("Digit at next: " + digits.charAt(i+1));
//                List<String> nextList = map.get(digits.charAt(i+1)+"");
//                System.out.println("Next List: " + nextList);
//                for(int k=0; k<nextList.size(); k++){
//                    System.out.println(firstList.get(j) + nextList.get(k));
//                    result.add(firstList.get(j) + nextList.get(k));
//                }
//            }
//        }
//
//        return result;

}

