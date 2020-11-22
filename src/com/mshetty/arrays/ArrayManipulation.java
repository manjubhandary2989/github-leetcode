package com.mshetty.arrays;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[][] queries = {{1,2,100},{2,5,100}, {3,4,100}};
        long result = arrayManipulation(5,  queries);
        System.out.println("Result: " +result);
    }

    public static long arrayManipulation(int n, int[][] queries){
        long[] arr=new long[n];

        for(int i=0; i<arr.length; i++)
            arr[i]=0;

        int q = queries.length;
        for(int i=0; i<q; i++){
            int a=queries[i][0];
            int b=queries[i][1];
            long k=queries[i][2];

            arr = addK(arr, a, b, k);
        }
        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + "  ");

        long result = maximumValue(arr);

        return result;
    }

    public static long[] addK(long[] arr, int a, int b, long k){
        for(int i=a-1; i<b; i++){
            arr[i] += k;
            System.out.println(arr[i]);
        }
        return arr;
    }

    public static long maximumValue(long[] arr){

        Arrays.sort(arr);
        long maxValue = arr[arr.length-1];

//        for(long val:arr){
//            if(val>maxValue){
//                maxValue = Math.max(val, maxValue);
//            }
//        }
        return maxValue;

    }
}
