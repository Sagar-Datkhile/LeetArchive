class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0, right = 0, maxLength = 0;
        
        while(right < s.length()){
            char currCharacter = s.charAt(right);

            if(map.containsKey(currCharacter)){
                int currCharIndex = map.get(currCharacter);

                if(currCharIndex >= left){
                    left = currCharIndex + 1;
                }
            }
            maxLength = Math.max(maxLength,right-left+1);
            map.put(currCharacter,right);
            right++;

        }

        return maxLength;
        
    }
}