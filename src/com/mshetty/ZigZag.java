package com.mshetty;

import java.util.ArrayList;
import java.util.List;

public class ZigZag {

    public static void main(String[] args) {
        String result = convert("PAYPALISHIRING", 3);
        System.out.println("Result: " + result);
    }

    //Method 1: Sort by row
//    public static String convert(String s, int numRows){
//        int n = s.length();
//
//        //sanity check
//        if(numRows == 1)
//            return s;
//
//        List<StringBuilder> rows = new ArrayList<>();
//        for(int i=0; i< Math.min(numRows, s.length()); i++){
//            rows.add(new StringBuilder());
//        }
//
//        int curRow=0;
//        boolean goingDown=false;
//
//        for(char c:s.toCharArray()){
//            rows.get(curRow).append(c);
//
//            if(curRow == 0 || curRow == numRows-1)
//                goingDown = !goingDown;
//
//            curRow += goingDown ? 1: -1;
//        }
//
//        StringBuilder ret = new StringBuilder();
//        for(StringBuilder row:rows){
//            ret.append(row);
//        }
//
//        return ret.toString();
//
//    }

    public static String convert(String s, int numRows) {
       if(numRows == 1 || numRows >= s.length())
           return s;

       char[] chars = s.toCharArray();
       StringBuilder[] zigzag = new StringBuilder[numRows];

       for(int i=0; i<zigzag.length; i++){
           zigzag[i] = new StringBuilder();
       }

       int row=0;
       int step=1;

       for(char c:chars){
           zigzag[row].append(c);

           if(row == 0)
               step =1;
           else if(row == (numRows -1))
               step = -1;

           row += step;
       }

       StringBuilder result = new StringBuilder();
       for(StringBuilder sb : zigzag){
           result.append(sb);
       }

       return result.toString();
       }
}
