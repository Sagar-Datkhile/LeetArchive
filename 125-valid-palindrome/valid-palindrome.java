class Solution {
    public boolean isPalindrome(String s) {
        String lowerstr = s.toLowerCase();
        char[] str = lowerstr.toCharArray();
        int i=0, j= s.length()-1;
        while(i<j){
            while(i<j && Character.isLetterOrDigit(str[i]) != true) i++;
            while(i<j && Character.isLetterOrDigit(str[j]) != true) j--;
            if(str[i] ==str[j]){
                i++; j--;
            }else{
                return false;
            }
        }
        return true;
        
    }
}