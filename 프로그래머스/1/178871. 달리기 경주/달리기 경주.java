import java.util.Map;
import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        int up_rank;
        String up_person;
        Map<String, Integer> playerMap = new HashMap<>();
        Map<Integer, String> rankMap = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
            playerMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }
        
        for(int i=0; i<callings.length; i++) {
            //올라가야 하는 사람
            up_person = callings[i];
            //올라가야하는 사람 등수
            up_rank = playerMap.get(up_person);
            
            playerMap.put(up_person , up_rank-1);
            playerMap.put(rankMap.get(up_rank-1) , up_rank);
            rankMap.put(up_rank, rankMap.get(up_rank-1));
            rankMap.put(up_rank-1, up_person);
        }
        
        for(int i=0; i<players.length; i++) {
            answer[i] = rankMap.get(i);
        }

        return answer;
    }
}