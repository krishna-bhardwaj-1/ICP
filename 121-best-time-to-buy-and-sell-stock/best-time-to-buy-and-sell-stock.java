class Solution {
    public int maxProfit(int[] prices) {
        int kharid=Integer.MAX_VALUE;
        int bechna=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<kharid){
                kharid=prices[i];
            }
            else if(prices[i]-kharid>bechna){
                bechna=prices[i]-kharid;
            }
        }
        return bechna;
    }
}