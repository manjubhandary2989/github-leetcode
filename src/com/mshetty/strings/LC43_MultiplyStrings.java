package com.mshetty.strings;

public class LC43_MultiplyStrings {
    public static void main(String[] args) {
        String res = multiply("123", "40");
        System.out.println("Res: " +res);

    }

    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        int[] pos = new int[m+n];

        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                int mul = (num1.charAt(i) - '0') *  (num2.charAt(j) - '0');
                int p1 = i+j;
                int p2 = i+j+1;
                int sum = mul + pos[p2];
                pos[p1] += sum/10;
                pos[p2] = sum%10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int val:pos){
            if(!(sb.length()==0 && val==0))
                sb.append(val);
        }

        return sb.length() == 0? "0":sb.toString();

    }




}
