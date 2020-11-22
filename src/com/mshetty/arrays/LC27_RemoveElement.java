package com.mshetty.arrays;

public class LC27_RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int length = removeElement(nums, 2);

        System.out.println("len: " + length);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        //sanity check

        if(nums.length == 0)
            return 0;

        int n=nums.length;
        int count=0;

        for(int i=0; i<n; i++){
            if(nums[i-count] == val) {
                System.out.println("i: " + i);
                int element = nums[i-count];

                for(int j=(i-count); j<n-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[n-1]=element;
                count++;
            }

        }
        return n-count;
    }
}
