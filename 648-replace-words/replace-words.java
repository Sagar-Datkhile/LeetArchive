import java.util.*;

class Solution {
    
    // Trie Node
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }
    
    private TrieNode root;
    
    public String replaceWords(List<String> dictionary, String sentence) {
        root = new TrieNode();
        
        // Step 1: Build Trie from dictionary
        for (String word : dictionary) {
            insert(word);
        }
        
        // Step 2: Replace words in sentence
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split(" ");
        
        for (String word : words) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(searchShortestRoot(word));
        }
        
        return result.toString();
    }
    
    // Insert word into Trie
    private void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }
    
    // Search shortest prefix root
    private String searchShortestRoot(String word) {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();
        
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            
            if (node.children[index] == null) {
                return word; // No root found
            }
            
            prefix.append(ch);
            node = node.children[index];
            
            if (node.isEnd) {
                return prefix.toString(); // Shortest root found
            }
        }
        
        return word;
    }
}
