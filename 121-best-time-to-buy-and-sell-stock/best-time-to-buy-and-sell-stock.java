class Solution {
    public int maxProfit(int[] prices) {
        int minValue = prices[0];
        int result = 0;
    
        for(int i=0; i<prices.length; i++){
            
            minValue = Math.min(minValue,prices[i]);    //Track/update min stock price
            result = Math.max(result, prices[i] - minValue); //Update maximum profit 
        }

        return result;
    }
}