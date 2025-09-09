class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int div = 1;
        while(x/div>= 10){
            div*= 10;
        }

        while(x != 0){
            int right = x % 10; //rightmost digit
            int left = x / div;   //leftmost digit

            if(left != right){
                return false;
            }

            x = (x % div) / 10;
            div = div / 100; 
        }
    return true;
    }
}