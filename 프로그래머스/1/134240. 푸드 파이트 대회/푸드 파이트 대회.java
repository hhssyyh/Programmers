import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "0";
        
        for(int i=food.length-1; i>=1; i--) {
            for(int j=0; j<food[i]/2; j++) {
                answer = Integer.toString(i) + answer;
                answer = answer + Integer.toString(i);
            }
        }
        
        return answer;
    }
}