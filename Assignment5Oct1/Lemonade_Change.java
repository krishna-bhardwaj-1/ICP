package Assignment5Oct1;

public class Lemonade_Change {
    public static void main(String[] args) {
        int[] bills={5,5,5,10,20};
        System.out.println(lemonadeChange(bills));
    }

    public static boolean lemonadeChange(int[] bills){
        int five=0;
        int ten=0;
        for (int i=0;i<bills.length;i++){
            if(bills[i]>5){
                int dene=bills[i]-5;
                while (dene>=10 && ten>0){
                    dene-=10;
                    ten--;
                }
                while (dene>=5 && five>0){
                    dene-=5;
                    five--;
                }
                if(dene>0) return false;
            }
            if(bills[i]==5) five++;
            else if(bills[i]==10) ten++;
        }
        return true;
    }
}
