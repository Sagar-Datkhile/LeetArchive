class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length+1;
        int total = 0;
        int oddXor = 0;

        // XOR of 1 to n
        int[] decoded = new int[n];
        for(int i=1; i<=n; i++){
            total ^= i;
        }

        // XOR of odd elements of encoded
        for(int i=1; i<=n-2; i+=2){
            oddXor = oddXor ^ encoded[i];
        }

        decoded[0] = total ^ oddXor;
        for(int i=0; i<n-1; i++){
            decoded[i+1] = decoded[i] ^ encoded[i];
        }

        return decoded;
        
    }
}