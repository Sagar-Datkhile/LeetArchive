class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int left = 0;
        for(int i= 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[left]  = nums[i];
                left++;
            }

            
        }
        return left;
    }
}