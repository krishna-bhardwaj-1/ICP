package Assignment4Sept30;

public class Max_Consecutive_Ones_III {
    public static void main(String[] args) {
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        System.out.println(longestOnes(arr,k));
    }

    public static int longestOnes(int[] arr,int k){
        int max=0;
        int l=0;
        int r=0;
        int c=0;
        while (r<arr.length){
            if(arr[r]==0) c++;
            if(c>k){
                while (arr[l]==1){
                    l++;
                }
                c--;
                l++;
            }
            max=Math.max(max,(r-l+1));
            r++;
        }
        return max;
    }

}
