package Assignment6Oct3;

import  java.util.*;

public class Combinations {
    static List<List<Integer>> ans;
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<List<Integer>> ans=combine(n,k);
        for (List<Integer> ll:ans){
            System.out.println(ll);
        }
    }

    public static List<List<Integer>> combine(int n,int k){
        ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        helper(ll,n,k,1);
        return ans;
    }

    public static void helper(List<Integer> ll,int n,int k,int i){
        if(ll.size()==k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for (;i<=n;i++){
            ll.add(i);
            helper(ll,n,k,i+1);
            ll.remove(ll.size()-1);
        }
    }
}
