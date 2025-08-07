class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        char[] characters = "0123456789abcdef".toCharArray();
        StringBuilder hexaDecimal = new StringBuilder();
        
        while(num!=0 && hexaDecimal.length() < 8){
            int digit = num & 15;
            hexaDecimal.append(characters[digit]);
            num >>>= 4;
        }
        
        return hexaDecimal.reverse().toString();
    }
}