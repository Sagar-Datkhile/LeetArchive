class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> zerolost = new ArrayList<>();
        List<Integer> onelost = new ArrayList<>();

        for(int[] match: matches){
            int winner = match[0]; 
            int loser = match[1];
            if(map.containsKey(loser) == false){
                map.put(loser,1);
            }else{
                map.put(loser,map.get(loser)+1);
            }

            map.putIfAbsent(winner,0);
            
        }
        for(int player: map.keySet()){
            int count = map.get(player);
            if(count == 0){
                zerolost.add(player);
            }else if(count == 1){
                onelost.add(player);
            }
        }

        Collections.sort(zerolost);
        Collections.sort(onelost);
        return Arrays.asList(zerolost,onelost);

    }
}