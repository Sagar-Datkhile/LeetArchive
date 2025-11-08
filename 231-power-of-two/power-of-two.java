class Solution {
    public boolean isPowerOfTwo(int n) {
        // O(logN to the base 2) is not allowed!
        // int x = 1;
        // while(x<=n){
        //     if(x == n){
        //         return true;
        //     }else{
        //         x *= 2;
        //     }
        // }
        // return false;
        return (n>0 && (n&n-1) == 0);

    }
}