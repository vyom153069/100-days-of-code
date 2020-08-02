//leetcode 10
//solution
class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for(int j=1;j<=p.length();j++){
            if(p.charAt(j-1)=='*'){
                if(j>=2){
                    if(dp[0][j-2]==true){
                        dp[0][j]=true;
                    }
                }
            }
              
        }
        for(int i=1;i<=s.length();i++){
            dp[i][0]=false;
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='.'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    if(p.charAt(j-2)==s.charAt(i-1)||p.charAt(j-2)=='.'){
                        dp[i][j]=dp[i][j-2]||dp[i-1][j];
                    }else{
                        dp[i][j]=dp[i][j-2];
                    }   
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}