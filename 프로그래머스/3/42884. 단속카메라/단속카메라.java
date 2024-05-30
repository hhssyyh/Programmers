import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int pass = -30001;
        
        Arrays.sort(routes, Comparator.comparingInt(a -> a[1]));
        
        for(int[] r:routes) {
            if(pass<r[0]) {
                pass = r[1];
                answer++;
            }
        }
        
        return answer;
    }
}