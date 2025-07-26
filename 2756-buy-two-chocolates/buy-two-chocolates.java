class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int sum;
        int leftMoney;
        for(int i=0; i<prices.length-1; i++){
            sum = prices[i] + prices[i+1];
            leftMoney = money - sum;
            if(leftMoney < 0){
                continue;
            }else{
                return leftMoney;
            }
        }
        return money;


        
    }
}