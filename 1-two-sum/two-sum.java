class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            if(HM.containsKey(comp)){
                return new int[]{HM.get(comp),i};
            }else{
                HM.put(nums[i],i);
            }
        }
        return null;
    }
}