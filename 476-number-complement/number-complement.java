class Solution {
    public int findComplement(int num) {
        int mask = 1;
        while(mask < num){
            // Bit Masking
            mask = (mask << 1) | 1;
        }
        return num ^ mask;
    }
}