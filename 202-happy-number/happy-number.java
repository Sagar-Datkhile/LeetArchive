public class Solution {
    public boolean isHappy(int n) {
        Set<Integer>cycle = new HashSet<>();
        while(n != 1 && !cycle.contains(n)){
            cycle.add(n);
            n = nextValue(n);
                      
        }
        return n==1;
            
    }

    public int nextValue(int n){
        int totalSum = 0;
        while(n>0){
            int digit = n % 10;
            totalSum+= digit * digit;
            n = n/10;
        }
        return totalSum;
    }
}