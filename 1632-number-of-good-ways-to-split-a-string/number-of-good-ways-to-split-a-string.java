class Solution {
    public int numSplits(String s) {
        int n = s.length();
        
         int[] right = new int[26];
        for (char c : s.toCharArray()) {
            right[c - 'a']++;
        }
        
        int[] left = new int[26];
        int leftUnique = 0, rightUnique = 0;
        
        for (int freq : right) {
            if (freq > 0) rightUnique++;
        }
        
        int goodSplits = 0;
        
        for (int i = 0; i < n - 1; i++) {
            char c = s.charAt(i);
            
            if (left[c - 'a'] == 0) leftUnique++;
            left[c - 'a']++;
            
            right[c - 'a']--;
            if (right[c - 'a'] == 0) rightUnique--;
            
            if (leftUnique == rightUnique) goodSplits++;
        }
        
        return goodSplits;
    }
}
