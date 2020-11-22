package com.mshetty;

public class StringToInteger {
    public static void main(String[] args) {
        int result = myAtoi("   -42");

        System.out.println("Result:" + result);
    }

    public static int myAtoi(String str) {
        String s = str.trim();

        //sanity check
        if (s.length() == 0 || s == null)
            return 0;

        int startIndex=0;
        if (s.charAt(0) == '+' || s.charAt(0) == '-') {
           ++startIndex;
        }

        double res = 0;
        boolean isNegative = false;
        if (s.charAt(0) == '-')
            isNegative = true;

        System.out.println("startindex: " +startIndex);
        for (int i=startIndex; i < s.length(); i++) {
            System.out.println("Char val: " +s.charAt(i));
            //checking if ascii value is below or above 0 and 9
            if(s.charAt(i) < '0' || s.charAt(i) > '9' ) {
                break;
            }
            int digitValue = (int) s.charAt(i) - '0';
            res = res*10 + digitValue;

        }

        if (isNegative)
            res = -res;


        if ((res) < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) res;

    }
}
