class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int candy: candyType){
            set.add(candy);
        }
        int sizeOfArr = candyType.length/2;
        return Math.min(sizeOfArr,set.size());
        
    }
}