import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        int pass = 0;
        
        Arrays.sort(targets, Comparator.comparingInt(a -> a[1]));
        
        for(int[] t:targets) {
            if(t[0]>=pass) {
                pass = t[1];
                answer++;
            }
        }
        
        return answer;
    }
}