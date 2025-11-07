class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int emptybottle = numBottles;
        while(emptybottle >= numExchange){
            numBottles++;
            emptybottle -= numExchange;
            numExchange +=1;
            emptybottle +=1;
        }
        return numBottles; //Answer
    }
}