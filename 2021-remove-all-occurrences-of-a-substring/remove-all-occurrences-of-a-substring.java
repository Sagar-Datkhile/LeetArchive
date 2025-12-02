class Solution {
    public String removeOccurrences(String s, String part) {
        String result = s;
        while(result.contains(part)){
            result = result.replaceFirst(part, "");
        }
        return result;
    }
}