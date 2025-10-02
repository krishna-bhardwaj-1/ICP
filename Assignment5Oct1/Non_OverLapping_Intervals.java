package Assignment5Oct1;

import java.util.Arrays;

public class Non_OverLapping_Intervals {
    public static void main(String[] args) {
//        int[][] arr={{1,2},{2,3},{3,4},{1,3}};
        int[][] arr={{1,2},{1,2},{1,2}};
        System.out.println(eraseOverlapIntervals(arr));
    }
    public static int eraseOverlapIntervals(int[][] arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[1],b[1]));
        int r=arr[0][1];
        int c=1;
        for (int i=1;i<arr.length;i++){
            if(arr[i][0]>=r){
                c++;
                r=arr[i][1];
            }
        }
        return arr.length-c;
    }
}
