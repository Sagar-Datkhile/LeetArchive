class Solution {
    public int beautySum(String s) {
        int beauty = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            HashMap<Character, Integer>frequency = new HashMap<>();
            
            for(int j=i; j<n; j++){
                char c = s.charAt(j);
                frequency.put(c, frequency.getOrDefault(c,0)+1);
                int maxFreq = Integer.MIN_VALUE;
                int minFreq = Integer.MAX_VALUE;

                for(int f: frequency.values()){
                    maxFreq = Math.max(maxFreq,f);
                    minFreq = Math.min(minFreq,f);
                }
                beauty += (maxFreq-minFreq);

            }
        }
        return beauty;

        }
    }
