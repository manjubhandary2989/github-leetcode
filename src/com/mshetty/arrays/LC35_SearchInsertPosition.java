package com.mshetty.arrays;

public class LC35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = searchInsert(nums, target);
        System.out.println("Result: " + result);

    }

    public static int searchInsert(int[] nums, int target) {
        int lo = 0;
        int hi = nums.length - 1;

        if (nums.length == 0)
            return -1;

        while (lo<=hi) {
            int mid = lo + (hi - lo) / 2;

            if (target == nums[mid])
                return mid;

            if (target > nums[mid])
                lo = mid + 1;
            else
                hi = mid-1;
        }

        return lo;

    }


}
