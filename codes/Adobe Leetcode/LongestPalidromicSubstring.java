//leetcode 5 longest palindromic substring
//solution
class Solution {
    public String longestPalindrome(String s) {
        if(s==null||s.equals(""))return s;
        boolean[][] dp=new boolean[s.length()][s.length()];
        int count=0;
        int x=0,y=0;
        for(int gap=0;gap<s.length();gap++){
            for(int i=0,j=gap;j<dp[0].length;i++,j++){
                if(gap==0){
                    dp[i][j]=true;
                    x=i;
                    y=j;
                }else if(gap==1){
                    if(s.charAt(i)==s.charAt(j)){
                        dp[i][j]=true;
                        x=i;
                        y=j;
                    }
                }else{
                    if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]){
                        dp[i][j]=true;
                        x=i;
                        y=j;
                    }
                }
                
                // if(dp[i][j]==true)count=gap+1;
                // ans=s.substring(i,j);
            }
        }
       return s.substring(x,y+1);
    }
}