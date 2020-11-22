package com.mshetty;

public class ContainerMaxWater {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(height);
        System.out.println("Result: " +result);
    }

    //Method 1: o(n^2)
//    public static int maxArea(int[] height){
//        int n = height.length;
//        int maxArea = 0;
//        for(int i=0; i<n;i++){
//            for(int j=i+1; j<n; j++){
//                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j-i));
//            }
//        }
//        return maxArea;
//    }

    //Method 2 : O(n)
    public static int maxArea(int[] height){
        int n = height.length;
        int maxArea =  0, l=0, r=n-1;
        while(l<r){
            maxArea = Math.max(maxArea, (Math.min(height[l], height[r]) * (r-l)));
             if(height[l] < height[r])
                 l++;
             else
                 r--;

        }
        return maxArea;

    }


    }
