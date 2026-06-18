class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> HM = new HashMap<>();
    for(int i=0; i< nums.length; i++){
        int ans = target -  nums[i];
        if(HM.containsKey(ans)){
            return new int[]{HM.get(ans),i};
        }else{
            HM.put(nums[i],i);
        }
    }
    return null; 
    }
}