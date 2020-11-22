package com.mshetty;

import java.util.TreeMap;

public class IntegerToRoman {
    public static void main(String[] args) {
        String result = intToRoman(1994);
        System.out.println("Result: " +result);
    }
    //Method 1 : Using treemap
//   public static String intToRoman(int nums){
//       TreeMap<Integer, String> map = new TreeMap<Integer, String>();
//
//           map.put(1000, "M");
//           map.put(900, "CM");
//           map.put(500, "D");
//           map.put(400, "CD");
//           map.put(100, "C");
//           map.put(90, "XC");
//           map.put(50, "L");
//           map.put(40, "XL");
//           map.put(10, "X");
//           map.put(9, "IX");
//           map.put(5, "V");
//           map.put(4, "IV");
//           map.put(1, "I");
//
//           String s="";
//           int curNum = 0;
//           while(nums>0){
//               curNum = map.floorKey(nums);
//               s += map.get(curNum);
//               nums -= curNum;
//
//           }
//
//           return s;
//
//    }

    //Method 2 : arrays
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] div = {1000, 900, 500, 400, 100, 90,
                50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"M", "CM", "D", "CD", "C", "XC",
                "L", "XL", "X", "IX", "V", "IV", "I"};
        for (int i = 0; i < div.length;) {
            if (num >= div[i]) {
                result.append(roman[i]);
                num -= div[i];
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
