package Assignment4Sept30;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans=findAnagrams(s,p);
        System.out.println(ans);
    }
    public static List<Integer> findAnagrams(String s,String p){
        List<Integer> ll=new ArrayList<>();
        for (int i=0;i<=s.length()-p.length();i++){
            if(anagram(s.substring(i,i+p.length()),p)) ll.add(i);
        }
        return ll;
    }

    private static boolean anagram(String s,String t){
        int[] arr=new int[26];
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for (int i=0;i<t.length();i++){
            arr[t.charAt(i)-'a']--;
        }
        for (int i:arr) if(i!=0) return false;
        return true;
    }
}
