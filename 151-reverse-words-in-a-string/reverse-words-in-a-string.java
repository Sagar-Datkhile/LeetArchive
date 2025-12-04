class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String result = "";
        String str = new StringBuilder(s).reverse().toString();

        for(int i=0; i<n; i++){
            String word = "";
            while(i<n && str.charAt(i) != ' '){
                word+= str.charAt(i);
                i++;
            }
            String reversedWord = new StringBuilder(word).reverse().toString();
        if(reversedWord.length()>0)result += " " + reversedWord; 

        }
        return result.substring(1,result.length());
        
    }
}