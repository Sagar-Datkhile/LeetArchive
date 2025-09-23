class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(i>0 && nums[i] == nums[i-1]){ //To avoid duplications
                continue;
            }

            for(int j=i+1; j<n; ){
                int p = j+1, q = n-1;
                while(p<q){
                    long sum = (long)nums[i] + (long)nums[j] + (long)nums[p] + (long)nums[q]; 

                    if(sum < target){
                        p++;
                    }else if(sum > target){
                        q--;
                    }else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++; q--;
                        while(p<q && nums[p] == nums[p-1]){
                            p++;
                        }
                    }

                }
                j++;
                while(j<n && nums[j] == nums[j-1]){
                    j++;
                }
            }
        }
        return result;

    }
}