package com.mshetty.arrays;

import java.util.Stack;

public class LC41_TapWater {
    public static void main(String[] args) {
        int[] height = {1,2,3,0,1,2,3};
        int result = trap(height);
        System.out.println("Result: " +result);
    }

   // Solution 1 : Using two-pointer approach
    public static int trap(int[] height) {

        if(height.length == 0)
            return 0;

        int leftMax = height[0];
        int rightMax = height[height.length - 1];
        int left=1;
        int right = height.length-2;
        int water = 0;

        while(left <= right){
            if(leftMax <= rightMax){
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            } else {
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }
        return water;

    }

//    //Solution 1 : Using stack
//    public static int trap(int[] height) {
//        if(height == null || height.length<2)
//            return 0;
//
//        Stack<Integer> stack = new Stack<>();
//        int water=0, i=0;
//
//        while(i<height.length){
//            if(stack.isEmpty() || height[i] <= height[stack.peek()]){
//                System.out.println("Push: " +i);
//                stack.push(i++);
//            } else {
//                int pre = stack.pop();
//                if(!stack.isEmpty()){
//                    int minHeight = Math.min(height[stack.peek()], height[i]);
//                    water += (minHeight - height[pre]) * (i-stack.peek() - 1);
//                }
//            }
//        }
//    return water;
//    }
}
