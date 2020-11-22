package com.mshetty.arrays;

public class MinimumSwaps {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 2, 4, 5, 6};
        int result = minimumSwaps(arr);
        System.out.println("Result: " +result);

    }

    public static int minimumSwaps(int[] arr){
        int swaps = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != (i+1)){
                int t=i;
                while(arr[t] != i+1){
                        t++;
                }
                System.out.println("i : " +arr[i]);
                System.out.println("t: " +arr[t]);

                int temp = arr[t];
                arr[t] = arr[i];
                arr[i] = temp;
                swaps++;
            }
        }
        return swaps;
    }
}
