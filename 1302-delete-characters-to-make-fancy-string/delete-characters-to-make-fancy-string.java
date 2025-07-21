class Solution {
    public String makeFancyString(String s) {
        char[] str = s.toCharArray();
        char[] fancyStr = new char[str.length];
        int index = 0;
        if(str.length < 3){
            return s;
        }


        for(int i=0; i<str.length; i++){
            if(i < 2){
                fancyStr[index++] = str[i];
                continue;
            }
            
            if(fancyStr[index-1] != str[i] || fancyStr[index-2] != str[i]){
                fancyStr[index++] = str[i];                
            }

        }
   
        
        return new String(fancyStr, 0, index);

        
    }
}