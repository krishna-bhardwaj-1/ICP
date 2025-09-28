package Lecture1Sept26;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            if(nums[i]<target){
                i++;
            }
            else if(nums[j]>target){
                j--;
            }
            else{
                return new int[]{i,j};
            }
        }
        return new int[]{-1,-1};
    }
}
