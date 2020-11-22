package com.mshetty.arrays;

public class LC28_strStr {
    public static void main(String[] args) {
        String haystack = "abc";
        String needle =  "c";



        int result = strStr(haystack, needle);
        System.out.println("result: " +result);

    }

    public static int strStr(String haystack, String needle){
        int nLen = needle.length();
        int hLen = haystack.length();

        for(int i=0; i<hLen; i++){
            if(i+nLen > hLen)
                break;
            for(int j=0; j<nLen; j++){
                if(haystack.charAt(i+j) != needle.charAt(j))
                    break;

                if(j == nLen-1)
                    return i;
            }
        }

        return -1;
    }

//    public static int strStr(String haystack, String needle) {
//        //sanity check
//        if(needle.length() == 0 || haystack.equals(needle))
//            return 0;
//
//        if(needle.length() > haystack.length())
//            return -1;
//
//        char s = needle.charAt(0);
//        String str = null;
//        int nLen = needle.length();
//        for(int i=0; i<=haystack.length() - nLen; i++){
//            if(haystack.charAt(i) == s){
//                str = haystack.substring(i, (i+needle.length()));
//                if(str.equals(needle))
//                    return i;
//            }
//        }
//        return -1;
//    }
}
