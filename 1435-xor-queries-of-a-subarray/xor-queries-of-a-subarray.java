class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n + 1];
        
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] ^ arr[i];
        }
        
        int q = queries.length;
        int[] result = new int[q];
        
        for (int i = 0; i < q; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            result[i] = prefix[R + 1] ^ prefix[L];
        }
        
        return result;
    }
}
