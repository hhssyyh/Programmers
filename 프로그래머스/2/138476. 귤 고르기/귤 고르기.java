import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
        
        for (int num : tangerine) {
            sum.put(num, sum.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> values = new ArrayList<>(sum.values());
        Collections.sort(values, Collections.reverseOrder());
        
        for (int v : values) {
            k -= v;
            answer++;
            if (k <= 0) break;
        }
        
        return answer;
    }
}