class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] maxLenEndingAt = new int[26];
        int currentLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && 
               (s.charAt(i) - s.charAt(i - 1) == 1 ||
               (s.charAt(i - 1) == 'z' && s.charAt(i) == 'a'))) {
                currentLen++;
            } else {
                currentLen = 1;
            }

            int index = s.charAt(i) - 'a';
            maxLenEndingAt[index] = Math.max(maxLenEndingAt[index], currentLen);
        }

        int result = 0;
        for (int len : maxLenEndingAt) {
            result += len;
        }

        return result;
    }
}
