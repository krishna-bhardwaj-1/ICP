package Assignment5Oct1;

import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        int[][] arr={{1,2},{3,4},{5,6},{7,8}};
        System.out.println(findMinArrowShots(arr));
    }

    public static int findMinArrowShots(int[][] arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int r=arr[0][1];
        int arrow=1;
        for (int i=1;i<arr.length;i++){
            if(arr[i][0]<=r){
                r=Math.min(r,arr[i][1]);
            }
            else {
                arrow++;
                r=arr[i][1];
            }
        }
        return arrow;
    }
}
