class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for(int num:nums){
            if(num>0){
                positive.add(num);
            }else{
                negative.add(num);
            }
        }

        for(int i = 0; i<n/2; i++){
            result.add(positive.get(i));
            result.add(negative.get(i));
        }
        
        // List to array
        int[] res = new int[n];
        for(int i = 0; i<n; i++){
            res[i] = result.get(i); 
        }
        return res;       
    }
}