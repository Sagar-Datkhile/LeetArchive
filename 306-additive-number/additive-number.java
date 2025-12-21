class Solution {

    public boolean isAdditiveNumber(String num) {
        int n = num.length();

        // first number ends at i
        for (int i = 1; i <= n - 2; i++) {
            // avoid leading zero
            if (num.charAt(0) == '0' && i > 1) break;

            // second number ends at j
            for (int j = i + 1; j <= n - 1; j++) {
                if (num.charAt(i) == '0' && j - i > 1) break;

                String a = num.substring(0, i);
                String b = num.substring(i, j);

                if (isValid(a, b, num.substring(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValid(String a, String b, String remaining) {
        if (remaining.length() == 0) return true;

        String sum = addStrings(a, b);

        if (!remaining.startsWith(sum)) return false;

        return isValid(b, sum, remaining.substring(sum.length()));
    }

    // string-based addition
    private String addStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int x = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = x + y + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}
