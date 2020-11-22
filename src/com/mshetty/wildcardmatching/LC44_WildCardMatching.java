package com.mshetty.wildcardmatching;

public class LC44_WildCardMatching {
    public static void main(String[] args) {

    }

    public boolean isMatch(String s, String p) {
        boolean[][] dp = new boolean[s.length()+1][p.length()+1];
        dp[0][0] = true;

        char[] pattern = new char[p.length()+1];
        char[] string = new char[s.length()+1];

        string[0] = (char) 0;
        pattern[0] = (char) 0;

        for(int i=0; i<s.length(); i++){
            string[i+1] = s.charAt(i);
        }

        for(int i=0; i<p.length(); i++){
            pattern[i+1] = p.charAt(i);
        }

        for(int i=1; i<pattern.length; i++){
            if(pattern[i] == '*' && dp[0][i-1]==true){
                dp[0][i]=true;
            }
        }

        for(int i=1; i<string.length; i++){
            for(int j=1; j<pattern.length; j++){
                if(string[i] == pattern[j] || pattern[j] == '?'){
                    dp[i][j] = dp[i-1][j-1];
                } else if(pattern[j] == '*'){
                    dp[i][j] = dp[i][j-1] || dp[i-1][j];
                }
            }
        }

        return dp[s.length()][p.length()];
    }
}
