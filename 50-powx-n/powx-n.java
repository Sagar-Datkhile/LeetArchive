class Solution {
    public double myPow(double x, int n) {
        // return Math.pow(x,n);
        double ans = 1.0;
        long long_n = n; // Copy variable of power
        if(long_n<0){
            long_n = (-1)*long_n;
        }
        while(long_n>0){
            if(long_n % 2 == 1){
                ans = ans * x;
                long_n -= 1;
            }else{
                x = x*x;
                long_n /= 2;
            }
        }
        if(n<0){
            ans = (double)(1.0) / (double)(ans);
        }
        return ans;
        
    }
}