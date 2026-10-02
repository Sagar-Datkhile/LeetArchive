class Solution {
    public int thirdMax(int[] nums) {
        long first_max = Long.MIN_VALUE, second_max = Long.MIN_VALUE, third_max = Long.MIN_VALUE;
        
        for(int num: nums){
            if(num == first_max || num == second_max || num == third_max){
                continue;
            }
            if(num > first_max){
                third_max = second_max;
                second_max = first_max;
                first_max = num;
            }else if(num>second_max){
                third_max = second_max;
                second_max = num;
            }else if(num > third_max){
                third_max = num;
            }

        }
        return third_max == Long.MIN_VALUE ? (int) first_max : (int) third_max;
    }
}