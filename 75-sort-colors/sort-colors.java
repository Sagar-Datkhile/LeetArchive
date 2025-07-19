class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        int temp;

        while(mid<=end){
            switch(nums[mid]){
                
                case 0:
                    //Swap: mid and start
                    temp = nums[start];
                    nums[start] = nums[mid];
                    nums[mid] = temp;
                    mid++; start++;
                    break;
                
                case 1: 
                    // Increment mid only
                    mid++;
                    break;
                
                case 2:
                    // Swap mid and end
                    temp = nums[mid];
                    nums[mid] = nums[end];
                    nums[end] = temp;
                    end--;
                    break;
            
            }
        }

    }
}