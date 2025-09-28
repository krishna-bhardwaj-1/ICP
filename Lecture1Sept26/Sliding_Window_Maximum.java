package Lecture2Sept27;

import java.util.*;

public class Sliding_Window_Maximum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        int[] ans=Sliding_Window(arr,k);
        System.out.println(ans);
    }
    public static int[] Sliding_Window(int[] arr,int k){
        Deque<Integer> dq=new ArrayDeque<>();
        List<Integer> ans=new ArrayList<>();
        for (int i=0;i<k;i++){
            while (dq.size()>0 && arr[dq.peekLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.add(i);
        }

        for (int i=k;i<arr.length;i++){
            ans.add(arr[dq.peekFirst()]);

            while (dq.size()>0 && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while (dq.size()>0 && arr[dq.peekLast()]<=arr[i]){
                dq.removeLast();
            }
            dq.add(i);
        }

        int[] ar=new int[dq.size()];
        for (int i=0;i<dq.size();i++){
            ar[i]=ans.get(i);
        }
        return ar;
    }
}
