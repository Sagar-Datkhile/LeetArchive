class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[left++] = nums[i];
            }
        }
        while(left<nums.length){
            nums[left++] = 0;
        }
    }
}