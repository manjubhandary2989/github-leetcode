package com.mshetty;

public class LC50_Pow {
    public static void main(String[] args) {
        double result = myPow(2,21474836);
        System.out.println("Res: " +result);
    }

    public static double myPow(double x, int n){
        if(n == 0)
            return 1;

        double result = myPow(x,n/2);

        if(n % 2 == 0){
            return result * result;
        } else {
            if(n > 0)
                return x*result*result;
            else
                return (result*result)/x;
        }
    }
}
