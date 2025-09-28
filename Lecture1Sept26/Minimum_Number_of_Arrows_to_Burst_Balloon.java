package Lecture2Sept27;

import java.util.Arrays;

public class Minimum_Number_of_Arrows_to_Burst_Balloon {
    public static void main(String[] args) {
        int[][] arr={{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(arr));
    }
    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a, b)->Integer.compare(a[0],b[0]));
        int arrow=1;
        int x1=points[0][0];
        int x2=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]<=x2){
                x1=Math.max(x1,points[i][0]);
                x2=Math.min(x2,points[i][1]);
            }
            else{
                arrow++;
                x1=points[i][0];
                x2=points[i][1];
            }
        }
        return arrow;
    }
}
