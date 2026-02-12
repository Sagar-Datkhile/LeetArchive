class Solution {
    public boolean isPalindrome(String s) {
        String lowercased = s.toLowerCase();
        lowercased = lowercased.replaceAll("[^A-Za-z0-9]","");
        int i=0, j= lowercased.length()-1;
        while(i<=j){
            if(lowercased.charAt(i) != lowercased.charAt(j)){
                return false;
            }
            i++; j--;
        }
        return true;
    }
}