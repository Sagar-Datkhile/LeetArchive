class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>result = new ArrayList<>();


        for(int num:nums){
            if(map.containsKey(num) == false){
                map.put(num,1);
            }else{
                int freq = map.get(num);
                map.put(num, map.get(num)+1);
            }
        }

        for(int key:map.keySet()){
            if(map.get(key) > nums.length/3){
                result.add(key);
            }
        }
        return result;
        
    }
}