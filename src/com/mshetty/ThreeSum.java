package com.mshetty;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> resultList = threeSum(nums);
        System.out.println(resultList);

    }
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int sum=0;
        Set<List<Integer>> resultList = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            int current = nums[i];
            int left = i+1;
            int right = n-1;

            while(left<right){
                sum = current+ nums[left] + nums[right];
                if(sum == 0)
                    resultList.add(Arrays.asList(current, nums[left++], nums[right--]));
                else if(sum>0)
                    right--;
                else if(sum<0)
                    left++;

            }
        }
        return new ArrayList<>(resultList);
    }
}
