class Solution {
    public int countSetBits(int n){
      int count = 0;
      while(n>0){
        n = n & (n-1);
        count++;
      }
      return count;
    }
    public boolean canSortArray(int[] nums) {
        int[] values = nums.clone();
        int n = nums.length;
        for(int i=0; i<n; i++){
          for(int j = 0; j<n-i-1; j++){
              if(values[j]<= values[j+1]){
                // No swap needed
                continue;
              }

              // Swap the elements
              if(countSetBits(values[j]) == countSetBits(values[j+1])){
                int temp = values[j+1];
                values[j+1] = values[j];
                values[j] = temp;
              }else{
                return false;
              }
          }
        }
        return true;
    }
}