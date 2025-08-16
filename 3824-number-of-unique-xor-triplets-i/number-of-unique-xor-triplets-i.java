class Solution {
    public  int msb(int n) {
    int pos = 0;
    while (n > 0) {
        pos++;
        n >>= 1;
    }
    return pos - 1;
}
    public int uniqueXorTriplets(int[] nums) {
       
        int n = nums.length;
        while(n < 3){
            return n;
        }
        int m = msb(n);
        return 1 << (m+1);
    }
}