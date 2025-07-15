class Solution {
    public boolean isValid(String word) {
        char[] charr = word.toCharArray();
        boolean hasVowels = false;
        boolean hasConsonents = false;

        for(char ch : charr){
            if(!Character.isLetterOrDigit(ch) || word.length() < 3){
                return false;
            }

            char lowerCase = Character.toLowerCase(ch);
            if("aeiou".indexOf(lowerCase) != -1){
                hasVowels = true;
            }else if(Character.isLetter(lowerCase)){
                hasConsonents = true;
            }
           


    }
        return hasVowels && hasConsonents;
}
}