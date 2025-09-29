package Assignment3Sept29;

import java.util.Arrays;

public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[] ans=spiralOrder(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] spiralOrder(int[][] matrix) {
        int minr=0;
        int minc=0;
        int maxr=matrix.length-1;
        int maxc=matrix[0].length-1;
        int te=matrix.length*matrix[0].length;
        int[] arr=new int[te];
        int c=0;
        while(c<te) {
            //row
            for (int i = minc; i <= maxc && c < te; i++) {
                arr[c++] = matrix[minr][i];
            }
            minr++;
            //col
            for (int i = minr; i <= maxr && c < te; i++) {
                arr[c++] = matrix[i][maxc];
            }
            maxc--;
            //row
            for (int i = maxc; i >= minc && c < te; i--) {
                arr[c++] = matrix[maxr][i];
            }
            maxr--;
            //col
            for (int i = maxr; i >= minr && c < te; i--) {
                arr[c++] = matrix[i][minc];
            }
            minc++;
        }
        return arr;
    }
}
