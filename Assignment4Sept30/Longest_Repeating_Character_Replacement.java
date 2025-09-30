package Assignment4Sept30;

public class Longest_Repeating_Character_Replacement {
    public static void main(String[] args) {
        String s="ABAB";
        int k=2;
        System.out.println(characterReplacement(s,k));
    }

    public static int characterReplacement(String s,int k){
        int[] arr=new int[26];
        int maxfre=0;
        int ans=0;
        int l=0;
        for (int r=0;r<s.length();r++){
            arr[s.charAt(r)-'A']++;
            maxfre=Math.max(maxfre,arr[s.charAt(r)-'A']);

            while ((r-l+1)-maxfre>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }

            ans=Math.max(ans,(r-l+1));
        }
        return ans;
    }

}
