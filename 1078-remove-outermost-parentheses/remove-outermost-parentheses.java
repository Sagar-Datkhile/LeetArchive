class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0; // keeps track of open parentheses balance

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                // If count > 0, it's not an outermost '('
                if (count > 0) {
                    result.append(ch);
                }
                count++; // increment when '(' appears
            } else {
                count--; // decrement when ')' appears
                // If count > 0, it's not an outermost ')'
                if (count > 0) {
                    result.append(ch);
                }
            }
        }

        return result.toString();
    }
}
