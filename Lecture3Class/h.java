package Lecture3Class;

import java.util.Arrays;

public class h {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        for (int[] ar:arr){
            System.out.println(Arrays.toString(ar));
        }
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                int tmp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=tmp;
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                int tmp=arr[i][j];
                arr[i][j]=arr[i][n-j-1];
                arr[i][n-j-1]=tmp;
            }
        }
        for (int[] ar:arr){
            System.out.println(Arrays.toString(ar));
        }
//        System.out.println(Arrays.toString(arr));
    }
}
