package com.mshetty;

import java.util.Arrays;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int result = threeSumClosest(nums, 1);
        System.out.println("Result: " +result);
    }

    public static int threeSumClosest(int[] nums, int target) {
      //Sorting the array
        Arrays.sort(nums);

        int n = nums.length;
        int diff = Integer.MAX_VALUE;

        for(int i=0; i<n && diff != 0; i++){
            int current = nums[i];
            int left = i+1;
            int right = n-1;

            while(left<right){
                int sum = current + nums[left] + nums[right];
                System.out.println("Sum:" +sum);
                if(Math.abs(target-sum) < Math.abs(diff)){
                    diff = target-sum;

                }

                if(sum>target)
                    right--;
                else if(sum<target)
                    left++;

            }
        }
        return target-diff;


    }
}
