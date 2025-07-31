class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        boolean isNegative = (dividend<0) ^ (divisor<0);

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        int quotient = 0;

        while(absDividend >= absDivisor){
            long temp = absDivisor; 
            long multiple = 1;

            while(absDividend >= (temp << 1)){
                temp <<= 1;     // temp = temp * 2
                multiple <<= 1; // multiple = multiple * 2
            }
            absDividend -= temp;
            quotient += multiple;
        }

        return isNegative ? -quotient : quotient;

    }
}