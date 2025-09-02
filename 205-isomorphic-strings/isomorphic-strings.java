class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>sMap = new HashMap<>();
        HashMap<Character, Character>tMap = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i++);
            if(sMap.containsKey(s_char) && sMap.get(s_char) != t_char){
                return false;
            }
            if(tMap.containsKey(t_char) && tMap.get(t_char) != s_char){
                return false;
            }

            sMap.put(s_char, t_char);
            tMap.put(t_char, s_char);

        }
        return true;
    }
}