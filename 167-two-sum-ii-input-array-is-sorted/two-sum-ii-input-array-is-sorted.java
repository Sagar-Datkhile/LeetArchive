class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer,Integer>map = new HashMap<>(); Space Comp: O(n)
        // To avoid use two pointer approch - Array is sorted!!!
        int left = 0, right = numbers.length-1;
        for(int i=0; i<numbers.length; i++){
            int result = numbers[left] + numbers[right];

            if(result == target){
                return new int[]{left+1,right+1};
            }else if(result<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
        
    }
}