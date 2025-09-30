class Solution {
    public int findDuplicate(int[] nums) {
        // Complexity O(nlogn)
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // Complexity O(logn)
        HashSet<Integer>set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num) == true){
                return num;
            }else{
                set.add(num);
            }
        }
        return -1;
    }
    
}