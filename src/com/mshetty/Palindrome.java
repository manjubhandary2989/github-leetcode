package com.mshetty;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    //Method 2: convert to string
//    public static boolean isPalindrome(int x) {
//        //sanity check
//        if(x<0){
//            return false;
//        }
//
//        String s = x + "";
//        StringBuilder sb = new StringBuilder(s);
//        sb.reverse();
//
//        if (sb.toString().equals(s.toString()))
//            return true;
//        else
//            return false;
//
//    }


// Method 1: without converting to string
    public static boolean isPalindrome(int x){
        //sanity check
        if(x<0){
            return false;
        }
        int reverse = 0;
        int num= x;
        while(num > 0){
            int digit = num%10;
            reverse = reverse*10 + digit;

            num /= 10;
        }

        if(x == reverse){
            return true;
        } else{
            return false;
        }
    }
}
