class Solution {
    public NestedInteger deserialize(String s) {
        if (s.charAt(0) != '[') {
            return new NestedInteger(Integer.parseInt(s));
        }

        Stack<NestedInteger> stack = new Stack<>();
        NestedInteger current = null;
        int num = 0;
        boolean isNegative = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') {
                if (current != null) {
                    stack.push(current);
                }
                current = new NestedInteger();
            } 
            else if (ch == '-') {
                isNegative = true;
            } 
            else if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } 
            else if (ch == ',' || ch == ']') {
                if (Character.isDigit(s.charAt(i - 1))) {
                    if (isNegative) num = -num;
                    current.add(new NestedInteger(num));
                }
                num = 0;
                isNegative = false;

                if (ch == ']' && !stack.isEmpty()) {
                    NestedInteger parent = stack.pop();
                    parent.add(current);
                    current = parent;
                }
            }
        }
        return current;
    }
}
