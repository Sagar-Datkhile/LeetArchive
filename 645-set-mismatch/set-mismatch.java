class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] result = new int[2];
        boolean[] seen = new boolean[n+1];

        // Finding Duplicates
        for(int num:nums){
            if(seen[num] == true){
                result[0] = num;
            }
            seen[num] = true;
        }

        // Finding Missing
        for(int i=1; i<=n; i++){
            if(seen[i] == false){
                result[1] = i;
                break;
            }
        }
        return result;
    }
}