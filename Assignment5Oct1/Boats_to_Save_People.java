package Assignment5Oct1;

import java.util.Arrays;

public class Boats_to_Save_People {
    public static void main(String[] args) {
        int[] people={3,2,2,1};
        int limit=3;
        System.out.println(numRescueBoats(people,limit));
    }

    public static int numRescueBoats(int[] people,int limit){
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boat=0;
        while (i<=j){
            if(people[i]+people[j]<=limit){
                i++;
                j--;
            }
            else j--;
            boat++;
        }
        return boat;
    }
}
