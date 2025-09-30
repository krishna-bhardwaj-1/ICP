package Assignment4Sept30;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s){
        Set<Character> set=new HashSet<>();
        int l=0;
        int r=0;
        int max=0;
        while (r<s.length()){
            char c=s.charAt(r);
            while (set.contains(c)){
                set.remove(s.charAt(l));
                l++;
            }
            max=Math.max(max,r-l+1);
            set.add(c);
            r++;
        }
        return max;
    }
}
