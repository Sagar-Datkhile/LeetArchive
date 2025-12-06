import java.util.*;

class Solution {
    Map<Integer, Boolean> memo = new HashMap<>();
    
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = (maxChoosableInteger * (maxChoosableInteger + 1)) / 2;
        if (sum < desiredTotal) return false;
        
        if (desiredTotal <= 0) return true;
        
        return canWin(0, desiredTotal, maxChoosableInteger);
    }

    private boolean canWin(int usedMask, int remainingTotal, int maxNum) {
        if (memo.containsKey(usedMask)) {
            return memo.get(usedMask);
        }

        for (int i = 1; i <= maxNum; i++) {
            int bit = 1 << i;
            
            if ((usedMask & bit) == 0) {
                if (i >= remainingTotal || 
                    !canWin(usedMask | bit, remainingTotal - i, maxNum)) {
                    
                    memo.put(usedMask, true);
                    return true;
                }
            }
        }

        memo.put(usedMask, false);
        return false;
    }
}
