package com.mshetty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> resultList = fourSum(nums, 0);
        System.out.println(resultList);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(nums, target, 0, 4);
    }
    public static List<List<Integer>> kSum(int[] nums, int target, int start, int k) {
        List<List<Integer>> res = new ArrayList<>();
        System.out.println("target: " +target + ", start: " + start + ", k: " +k);
        if (start == nums.length || nums[start] * k > target || target > nums[nums.length - 1] * k)
            return res;
        if (k == 2)
            return twoSum(nums, target, start);
        for (int i = start; i < nums.length; ++i) {
            System.out.println("Running now:" +i + ", nums[i] : " + nums[i]);
            if (i == start || nums[i - 1] != nums[i])
                for (var set : kSum(nums, target - nums[i], i + 1, k - 1)) {
                    System.out.println("Set: " + set);
                    res.add(new ArrayList<>(Arrays.asList(nums[i])));
                    System.out.println("Res: " + res);
                    System.out.println("Here: " + res.get(res.size() - 1));
                    res.get(res.size() - 1).addAll(set);
                    System.out.println("Res now:" + res);
                }
            System.out.println("**********************************");
        }
        return res;
    }
    public static List<List<Integer>> twoSum(int[] nums, int target, int start) {
        System.out.println("Running two sum: " + nums);
        List<List<Integer>> res = new ArrayList<>();
        int lo = start, hi = nums.length - 1;
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (sum < target || (lo > start && nums[lo] == nums[lo - 1]))
                ++lo;
            else if (sum > target || (hi < nums.length - 1 && nums[hi] == nums[hi + 1]))
                --hi;
            else
                res.add(Arrays.asList(nums[lo++], nums[hi--]));
        }

        System.out.println("Result of two sum:" + res);
        return res;
    }


}

