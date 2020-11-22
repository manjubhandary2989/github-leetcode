package com.mshetty.arrays;

public class LC34_FindFirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,10};
        int target =  8;
        int[] result = searchRange(nums, target);
        for(int n:result)
        System.out.println(n);
    }

    private static int extremeInsertionIndex(int[] nums, int target, boolean left){
        int lo= 0;
        int high = nums.length;

        while(lo<high){
            int mid = lo + (high-lo)/2;
            if(nums[mid] > target || (left && target == nums[mid]))
                high = mid;
            else
                lo=mid+1;

        }
        return lo;
    }

    public static int[] searchRange(int[] nums, int target){

        //sanity check
        if(nums.length == 0)
            return new int[]{-1, -1};

        int[] targetRange = {-1, -1};
        int leftIdx = extremeInsertionIndex(nums, target, true);

        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }

        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

        return targetRange;

    }
}
