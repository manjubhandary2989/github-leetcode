package com.mshetty.arrays;

public class LC29_DivideTwoIntegers {
    public static void main(String[] args) {

        int result = divide(-2147483648,  2);
        System.out.println("Result: " +result);


    }
    public static int divide(int dividend, int divisor) {

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        int result = 0;
        while(dividend-divisor >= 0){
            result++;
            dividend -= divisor;
        }

        return result*sign;

        //sanity check

        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (divisor == 1)
            return dividend;

        int result = 0;

        int dividendAbs = Math.abs(dividend);
        System.out.println(dividendAbs);
        int divisorAbs  = Math.abs(divisor);
        System.out.println(divisorAbs);
        System.out.println("ans: " + (dividendAbs - divisorAbs));


        while((dividendAbs - divisorAbs) >= 0){
            if(result==Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else
                result++;
                dividendAbs -= divisorAbs;
        }

        if((divisor<0 && dividend>=0) || (divisor>=0 && dividend<0))return result*(-1);
        return result;

    }


}
