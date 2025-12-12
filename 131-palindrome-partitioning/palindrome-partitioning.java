class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(0, s, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, String s, List<String> current, List<List<String>> result) {
        // If we reached the end of the string, record the partition
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Explore all possible partitions
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s, start, end)) {
                current.add(s.substring(start, end + 1));  // choose
                backtrack(end + 1, s, current, result);    // explore
                current.remove(current.size() - 1);        // un-choose
            }
        }
    }

    // Check if substring s[l..r] is a palindrome
    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
