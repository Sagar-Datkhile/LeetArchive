class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;

        // Bring non-zero elements to front
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[left++] = nums[i];
            }
        }
        // Add rest elements as zero
        while(left<nums.length){
            nums[left++] = 0;
        }
    }
}