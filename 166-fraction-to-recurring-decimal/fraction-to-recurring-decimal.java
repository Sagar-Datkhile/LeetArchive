public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        StringBuilder result = new StringBuilder();
        
        // Check for sign
        if ((numerator < 0) ^ (denominator < 0)) result.append("-");
        
        // Convert to long to handle overflow cases like -2147483648
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        
        // Append integer part
        result.append(num / den);
        num %= den;
        if (num == 0) return result.toString();
        
        // Handle fractional part
        result.append(".");
        Map<Long, Integer> map = new HashMap<>();
        
        while (num != 0) {
            // If we have seen this remainder before, it means repeating
            if (map.containsKey(num)) {
                int start = map.get(num);
                result.insert(start, "(");
                result.append(")");
                break;
            }
            
            // Store the position of this remainder
            map.put(num, result.length());
            
            num *= 10;
            result.append(num / den);
            num %= den;
        }
        
        return result.toString();
    }
}