package Assignment5Oct1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Queue_Reconstruction_By_height {
    public static void main(String[] args) {
        int[][] people={{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] ans=reconstructQueue(people);
        for (int[] ar:ans){
            System.out.print(Arrays.toString(ar)+" - ");
        }
    }
    public static int[][] reconstructQueue(int[][] arr){
        Arrays.sort(arr,new Comparator<int[]>(){
            @Override
            public int compare(int[] a,int[] b){
                if(a[0]==b[0]){
                    return a[1]-b[1];
                }
                return b[0]-a[0];
            }
        });

        List<int[]> ans=new ArrayList<>();
        for (int[] ar:arr){
            ans.add(ar[1],ar);
        }
        return ans.toArray(new int[arr.length][2]);
    }
}
