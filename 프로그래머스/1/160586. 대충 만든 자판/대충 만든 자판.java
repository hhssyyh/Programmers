import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<targets.length; i++) {
            int count = 0;
            for(int j=0; j<targets[i].length(); j++) {
                if(map.containsKey(targets[i].charAt(j))) {
                    if((map.get(targets[i].charAt(j))!=(101))) {
                        count += map.get(targets[i].charAt(j));
                    } else {
                        count = -1;
                        break;
                    }
                    
                } else {
                    int min = 101;
                    for(String st: keymap) {
                        if((st.indexOf(targets[i].charAt(j))!=(-1))) {
                            min = min < st.indexOf(targets[i].charAt(j)) ? min:st.indexOf(targets[i].charAt(j));
                        }
                    }
                    map.put(targets[i].substring(j, j+1), min+1);
                    if(min==(101)) {
                        count = -1;
                        break;
                    } else {
                        count += min+1;
                    }
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}