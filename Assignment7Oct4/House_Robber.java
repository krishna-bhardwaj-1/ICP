package Assignment7Oct4;

import java.util.Arrays;

public class House_Robber {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        System.out.println(helper(nums,0,dp));
    }

    public static int helper(int[] nums,int idx,int[] dp){
        if (idx>=nums.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        //loot liya
        int c1=nums[idx]+helper(nums,idx+2,dp);
        int c2=helper(nums,idx+1,dp);
        return dp[idx]=Math.max(c1,c2);
    }
}
