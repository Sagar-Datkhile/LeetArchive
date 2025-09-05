class Solution {
    public int reverse(int x) {
        int min = -2147483648;
        int max =  2147483647;
        int result = 0;
        while(x != 0){
            int digit = x % 10;
            x/=10;

            if(result > max/10 || (result == max/10 && digit > 7 )){ //positive overflow
                return 0;
            }

            if(result < min/10 || (result == min/10 && digit < -8)){  //negative overflow
                return 0;
            }

            result = (result*10) + digit;

        }
        return result;

    }
}