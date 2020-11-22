package com.mshetty;

public class LC41_FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        int result = firstMissingPositive(nums);
        System.out.println("Result: " +result);
    }

    public static int firstMissingPositive(int[] nums) {
        /* arr can have atmost consecutive numbers of length = nums.length starting from index 1 */
        int arr[] = new int[nums.length+1];

        for(int i:nums)
        {
            /* we need only values >=1 and not more than length of consecutive numbers because if they are more than consecutive numbers length obviously there will be a value missing in between */
            if(i>=1 && i<=nums.length) {
                System.out.println("i: " +i);
                arr[i] = 1;

            }
        }
        System.out.println("*********");
        for(int i:arr)
        {

            System.out.println(i);
        }

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==0)
                return i;
        }

        /* if no value is missed i.e if given values are consecutive then next consecutive item should be returned */
        return nums.length+1;
    }
}
