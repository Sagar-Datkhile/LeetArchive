class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i=0; i<prices.length-1; i++){
            int sum = prices[i] + prices[i+1];
            if((money-sum) < 0){
                continue;
            }else{
                return money-sum;
            }
        }
        return money;
    }
}