class Solution {
    public int wordCount(String[] startWords, String[] targetWords) {
        Set<String> set = new HashSet<>();
        for (String w : startWords) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            set.add(new String(chars));
        }

        int count = 0;
        for (String w : targetWords) {
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            for (int i = 0; i < chars.length; ++i) {
                String candidate = new StringBuilder()
                    .append(chars, 0, i)
                    .append(chars, i + 1, chars.length - i - 1)
                    .toString();
                if (set.contains(candidate)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}
