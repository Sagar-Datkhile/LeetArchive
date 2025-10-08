class Solution {
    public String reverseWords(String s) {
        // Trim spaces and split the string by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        // Use StringBuilder for efficient concatenation
        StringBuilder sb = new StringBuilder();
        
        // Traverse words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        
        return sb.toString();
    }
}
