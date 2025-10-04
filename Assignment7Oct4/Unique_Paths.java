package Assignment7Oct4;

import java.util.Arrays;

public class Unique_Paths {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        int[][] dp=new int[m][n];
        for (int[] ar:dp){
            Arrays.fill(ar,-1);
        }
        System.out.println(helper(0,0,m,n,dp));
    }

    public static int helper(int row,int col,int m,int n,int[][] dp){
        if(row==m-1 && col==n-1){
            return 1;
        }
        if(row>=m || col>=n) return 0;
        if(dp[row][col]!=-1){
            return dp[row][col];
        }

        int c1=helper(row+1,col,m,n,dp);
        int c2=helper(row,col+1,m,n,dp);
        return dp[row][col]=c1+c2;
    }
}
