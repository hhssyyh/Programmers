import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        char alp;
        
        for(int i=0; i<s.length(); i++) {
            alp = s.charAt(i);
            if(map.containsKey(alp)) {
                answer[i] = i-map.get(alp);
                map.put(alp, i);
            } else {
                map.put(alp, i);
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}