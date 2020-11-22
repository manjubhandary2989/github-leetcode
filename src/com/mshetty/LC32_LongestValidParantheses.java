package com.mshetty;


public class LC32_LongestValidParantheses {
    public static void main(String[] args) {
        String s=")()())";
        int result = longestValidParantheses(s);
        System.out.println(result);
    }

    public static int longestValidParantheses(String s){

        int left=0, right=0, maxLength=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '(')
                left++;
            else
                right++;

            if(left == right)
                maxLength = Math.max(maxLength, right*2);
            else if(right >= left)
                left = right = 0;
        }

        left=right=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == '(')
                left++;
            else
                right++;

        if(right == left)
            maxLength = Math.max(maxLength, left*2);
        else if(left>=right)
            left=right=0;
        }

        return maxLength;

    }
}
