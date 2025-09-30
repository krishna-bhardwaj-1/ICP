package Assignment4Sept30;

public class Permutation_in_String {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbtaooo";
        System.out.println(checkInclusion(s1,s2));
    }

    private static boolean checkInclusion(String s1,String s2){
        if(s1.length()>s2.length()) return false;
        int[] sfre=new int[26];
        for (char c:s1.toCharArray()){
            sfre[c-'a']++;
        }

        int l=0;
        int r=0;
        int[] fre=new int[26];
        while (r<s2.length()){
            fre[s2.charAt(r)-'a']++;
            if ((r-l+1)==s1.length()){
                if(same(sfre,fre)) return true;
                fre[s2.charAt(l)-'a']--;
                l++;
            }
            r++;
        }
        return false;
    }

    private static boolean same(int[] sfre, int[] fre) {
        for (int i=0;i<26;i++){
            if(sfre[i]!=fre[i]) return false;
        }
        return true;
    }
}
