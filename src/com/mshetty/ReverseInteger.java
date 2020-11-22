package com.mshetty;

public class ReverseInteger {

    public static void main(String[] args) {
        int num = 1534236469;
        System.out.println("Reverse: " + reverse(num));
    }

    public static int reverse(int n) {
        boolean isNegative = false;

        if(n < 0)
            isNegative = true;


        int x = Math.abs(n);
        int res=0;
        while(x > 0){
            System.out.println(res*10);
            if(res > Integer.MAX_VALUE/10)
                return 0;
            res = res*10 + x % 10;
            x = x/10;
        }

        if(isNegative)
            return -1 * res;
        else
            return res;
    }


//    public static int reverse(int x){
//        //sanity check
////        int result = 0;
////        StringBuilder sb = new StringBuilder();
////        sb.append(x);
////
////        String reverse = sb.reverse().toString();
////        result = Integer.parseInt(reverse);
////
////        return result;
//
//
//        long result = 0;
//        boolean isNegative = false;
//
//        if(x < 0)
//            isNegative = true;
//
//        int num = Math.abs(x);
//
//        while(num != 0 ){
//
//            if((result*10) >= 2147483647 || (result*10) <= -2147483648) {
//                return 0;
//            }
//
//            result = (result*10) + (num%10);
//            num /= 10;
//        }
//
//
//        if(isNegative) {
//            result = result * (-1);
//        }
//
//            return (int)result;
//
//    }
}

