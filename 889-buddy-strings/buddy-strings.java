class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        // Check for duplicate keys
        if(s.equals(goal)){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c - 'a']++;
                if(count[c-'a']>1){
                    return true;
                }
            }
            return false;
        }

        // Strings are different
        List<Integer>different = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                different.add(i);
            }
        }

        // If s & goal has only two letters
        return different.size() == 2 &&
            s.charAt(different.get(0)) == goal.charAt(different.get(1)) &&
            s.charAt(different.get(1)) == goal.charAt(different.get(0)); 
    }
}