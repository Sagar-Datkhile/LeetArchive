class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;

        int[] ans = new int[n];

        HashMap<Integer, Integer> fullLakes = new HashMap<>();

        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {

            if (rains[i] > 0) {
                int lake = rains[i];

                ans[i] = -1;

                if (fullLakes.containsKey(lake)) {

                    Integer dryDay = dryDays.ceiling(fullLakes.get(lake));

                    if (dryDay == null) {
                        return new int[0];
                    }

                    ans[dryDay] = lake;

                    dryDays.remove(dryDay);
                }

                fullLakes.put(lake, i);
            }

            else {
                dryDays.add(i);

                ans[i] = 1;
            }
        }

        return ans;
    }
}