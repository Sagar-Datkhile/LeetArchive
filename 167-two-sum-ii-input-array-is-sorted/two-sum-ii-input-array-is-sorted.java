class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0; i<numbers.length; i++){
            int result = target - numbers[i];
            if(map.containsKey(result)){
                return new int[]{map.get(result),i+1};
            }else{
                map.put(numbers[i], i+1);
            }
        }
        return new int[]{-1,-1};
        
    }
}