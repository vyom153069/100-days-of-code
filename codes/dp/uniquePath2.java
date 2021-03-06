//leetcode 63 
//solution
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0]==1)return 0;
        int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int j=0;j<dp[0].length;j++){
            if(obstacleGrid[0][j]!=1){
                dp[0][j]=1;
            }else {break;}
        }
        for(int i=0;i<dp.length;i++){
            if(obstacleGrid[i][0]!=1){
                dp[i][0]=1;
            }else {break;}
        }
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(obstacleGrid[i][j]==1){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}