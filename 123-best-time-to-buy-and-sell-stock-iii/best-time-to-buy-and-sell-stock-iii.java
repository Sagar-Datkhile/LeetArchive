class Solution {
    public int maxProfit(int[] prices) {
        int minValue1 = prices[0];
        int profit1 = 0;
        int minValue2 = prices[0];
        int profit2 = 0;

        for(int i=0; i<prices.length; i++){
            minValue1 = Math.min(minValue1, prices[i]);
            profit1 = Math.max(profit1, prices[i]-minValue1);
            minValue2 = Math.min(minValue2, prices[i] - profit1);
            profit2 = Math.max(profit2, prices[i] - minValue2);            
        } 
        return profit2;
        
    }
}