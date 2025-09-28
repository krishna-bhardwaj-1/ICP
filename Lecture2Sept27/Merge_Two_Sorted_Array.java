package Lecture2Sept27;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1={4,5,6,0,0,0};
        int[] nums2={1,2,3};
        int m=3;
        int n=3;
        merge(nums1,nums2,m,n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1,int[] nums2,int m,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else {
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }
}