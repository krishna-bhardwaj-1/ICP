package Assignment6Oct3;

import java.util.*;

public class Combination_Sum_II {
    public static void main(String[] args) {
        int[] candidate={10,1,2,7,6,1,5};
        int target=8;
        List<List<Integer>> ans=combinationSum2(candidate,target);
        for (List<Integer> ll:ans){
            System.out.println(ll);
        }
    }
    static List<List<Integer>> ans;
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(candidates);
        helper(ll,candidates,target,0);
        return ans;
    }
    public static void helper(List<Integer> ll,int[] candi,int target,int idx){
        if(target==0){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i=idx;i<candi.length;i++){
            if(i>idx && candi[i]==candi[i-1]) continue;
            if(candi[idx]>target) break;
            ll.add(candi[i]);
            helper(ll,candi,target-candi[i],i+1);
            ll.remove(ll.size()-1);
        }
    }
}
