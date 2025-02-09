package DP;

public class 정수_삼각형 {
    public int solution(int[][] triangle) {
        int n = triangle.length;
        int[][] dp = new int[n][n];

        dp[0][0] = triangle[0][0];
        for(int i = 1; i<n; i++) {
            //각 행마다 j의 최대값이 다르기 떄문에! n으로 두는게 아니라 i+1로 두기(삼각형 구조라 1씩 늘어남)
            for(int j = 0; j<i+1; j++) {
                if(j==0) {
                    dp[i][j] = dp[i-1][j] + triangle[i][j];
                }
                else {
                    dp[i][j] += Math.max(dp[i-1][j-1], dp[i-1][j]) + triangle[i][j];
                }
            }
        }
        int result = dp[n-1][0];
        for(int i = 1; i<n; i++){
            if(result<dp[n-1][i]) result = dp[n-1][i];
        }
        return result;
    }
}
