package Assignment7Oct4;

public class Maximum_Subarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i:nums){
            sum+=i;
            maxsum=Math.max(maxsum,sum);
            if (sum<0){
                sum=0;
            }
        }
        return maxsum;
    }
}
