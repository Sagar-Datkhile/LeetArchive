import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        
        // Edge case: if p is longer than s, no anagrams possible
        if (p.length() > s.length()) {
            return result;
        }
        
        // Frequency arrays for characters in p and current window in s
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        
        // Fill frequency array for string p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }
        
        int left = 0, right = 0;
        int pLen = p.length();
        int sLen = s.length();
        
        // Initialize the first window of size p.length()
        while (right < pLen) {
            sCount[s.charAt(right) - 'a']++;
            right++;
        }
        
        // Check the first window
        if (Arrays.equals(pCount, sCount)) {
            result.add(0);
        }
        
        // Slide the window across the string s
        while (right < sLen) {
            // Add the new character on the right
            sCount[s.charAt(right) - 'a']++;
            
            // Remove the character going out of the window on the left
            sCount[s.charAt(left) - 'a']--;
            
            // Move the window
            left++;
            right++;
            
            // Check if current window is an anagram
            if (Arrays.equals(pCount, sCount)) {
                result.add(left);
            }
        }
        
        return result;
    }
}