package com.mshetty;

public class LC45_JumpGame {
    public static void main(String[] args) {

    }

    public int jump(int[] nums){
        if(nums.length < 1)
            return 0;

        int ladder = nums[0];
        int stairs = nums[0];
        int jumps = 1;
        for(int level=1; level<nums.length; level++){
            if(level == nums.length-1)
                return jumps;
            if(level + nums[level] > ladder)
                ladder = level + nums[level];
            stairs--;

            if(stairs == 0){
                jumps++;
                stairs = ladder - level;
           }
        }
    return jumps;
    }
}
