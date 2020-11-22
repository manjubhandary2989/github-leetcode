package com.mshetty.arrays;

public class LC26_RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int length = removeDuplicates(nums);
        System.out.println("len: " + length);

        for (int i = 0; i < length; i++) {
            System.out.println(nums[i]);
        }

    }

    public static int removeDuplicates(int[] nums) {
        //sanity check
        if (nums.length == 0)
            return 0;

        int n = nums.length;
        if (n == 1)
            return n;

        int count=0;

        for(int i=1; i<n; i++){
            if(nums[i] == nums[i-1])
                count++;
            else
                nums[i-count]=nums[i];
        }
        return n-count;

    }

}
