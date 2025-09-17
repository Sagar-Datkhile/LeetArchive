class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> HM = new HashMap<>();
        int count = 0;
        for(int i=0; i<magazine.length(); i++){
            if(HM.containsKey(magazine.charAt(i))){
                count = HM.get(magazine.charAt(i));
                HM.put(magazine.charAt(i), ++count);
            }else{
                HM.put(magazine.charAt(i), 1);
            }
        }

            for(int i=0; i<ransomNote.length(); i++){
                if(HM.containsKey(ransomNote.charAt(i))){
                    count = HM.get(ransomNote.charAt(i));
                    HM.put(ransomNote.charAt(i), --count);
                    if(HM.get(ransomNote.charAt(i)) == 0){
                        HM.remove(ransomNote.charAt(i));
                    }
                    
                }else{
                    return false;
                }
            }
            return true;
            
        

        
    }
}