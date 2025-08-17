class Solution {
    public int minOperations(int[] nums) {
        int count = 0, n = nums.length;
        while(true){
            int count_zero = 0;
            int i = 0;
            for(i=0; i<n; i++ ){
                if((nums[i]&1) != 0){
                    break;
                }else if(nums[i] == 0){
                    count_zero += 1;
                }
            }
            if(count_zero == n){
                 return count;
            }
            // If all elements are even
            if(i == n){
                // divide all elemets by 2
                count += 1;
                for(i=0; i<n; i++){
                    nums[i] /= 2;
                }
            }

            // Subtract odd number by 1
            for(i = 0; i<n; i++){
                if((nums[i]&1) != 0){
                    count += 1;
                    nums[i] -= 1;
                }
            }


        }

        
    }
}