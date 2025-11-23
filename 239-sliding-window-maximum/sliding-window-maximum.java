class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        
        // First window
        for(int i=0; i<k; i++){
            while(dq.size() > 0 && nums[dq.getLast()] <= nums[i] ){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        for(int i = k; i< nums.length; i++){
            result.add(nums[dq.getFirst()]);

            // Remove not part of current window 
            while(dq.size() > 0 && dq.getFirst() <= i-k){
                dq.removeFirst();
            }

            // Remove smaller values
            while(dq.size() > 0 && nums[dq.getLast()] <= nums[i] ){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        result.add(nums[dq.getFirst()]);
        int[] res = new int[result.size()];
        Arrays.setAll(res, i-> result.get(i));
        return res;

    }
}