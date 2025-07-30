class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int val:nums){
            //  Same elements will be cancel out
            ans = ans ^ val;    
        }
        return ans;
    }
}