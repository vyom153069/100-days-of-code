//leetcode 91
//solution

class Solution {
    public int numDecodings(String s) {
        int[] dp=new int[s.length()+1];
        dp[0]=1;
        if(s.charAt(0)!='0')dp[1]=1;
        for(int i=2;i<=s.length();i++){
            int firstCut=Integer.valueOf(s.substring(i-1,i));
            int secondCut=Integer.valueOf(s.substring(i-2,i));
            if(firstCut>0)dp[i]=dp[i-1];
            if(secondCut>=10&&secondCut<=26){
                dp[i]=dp[i]+dp[i-2];
            }
        }
        return dp[s.length()];
    }
}