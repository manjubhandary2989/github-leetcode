package com.mshetty.strings;

import java.util.HashMap;
import java.util.Map;

public class LC38_CountAndSay {
    public static void main(String[] args) {
        int n=10;
        String result = countAndSay(n);
        System.out.println("Result: " +result);
        System.out.println(result.equals("13211311123113112211"));
    }

    public static String countAndSay(int n){

        //base case
        if(n==1)
            return "1";
        else {
             String str = countAndSay(n-1);
             return countGroups(str);
        }




    }

    public static String countGroups(String s){
        String previous = "0";
        int count = 0;
        String res="";
        boolean first=true;

        for(int i=0; i<s.length(); i++){
            String c=s.charAt(i)+"";
            if(c.equals(previous)) {
                count++;
            }
            else {
                if(!first)
                    res += count+"" + previous + "";

                count=1;
                previous = c;
                first=false;
            }

            if(i == (s.length()-1))
                res += count+"" + c + "";

        }
        return res;
    }
}
