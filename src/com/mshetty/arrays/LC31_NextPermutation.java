package com.mshetty.arrays;

public class LC31_NextPermutation {
    public static void main(String[] args){

    }
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;

        while(i >= 0 && nums[i] >= nums[i+1]){
            i--;
        }

        if(i >= 0){
            int j = nums.length-1;
            while(j>=0 && nums[j] ){
                j--;
            }

            swap(nums, i, j);
        }

        reverse(nums, i+1);
    }

    private static void reverse(int[] nums, int i) {
        int j = nums.length-1;
        while(i<j){
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
