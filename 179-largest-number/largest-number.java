class Solution {
    public String largestNumber(int[] nums) {
     String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // Custom comparator: compare combined strings
        Arrays.sort(strNums, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Descending order
            }
        });

        // If the largest number is "0", just return "0"
        if (strNums[0].equals("0")) {
            return "0";
        }

        // Build the largest number
        StringBuilder largest = new StringBuilder();
        for (String num : strNums) {
            largest.append(num);
        }

        return largest.toString();
    }
}