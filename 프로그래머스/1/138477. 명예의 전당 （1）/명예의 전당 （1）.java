import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] top = new int[k];
        
        int min = score[0];
        for(int i=0; i<score.length; i++) {
            if(i<k) {
                top[i] = score[i];
                min = min<score[i] ? min : score[i];
                answer[i] = min;
                if(i==k-1) {
                    Arrays.sort(top);
                }
            } else {
                top[0] = top[0]>score[i] ? top[0] : score[i];
                Arrays.sort(top);
                answer[i] = top[0];
            }
            // System.out.println(top[0]);
        }
        
        return answer;
    }
}