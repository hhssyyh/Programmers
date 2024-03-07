import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i=0; i<enemy.length; i++) {
            n -= enemy[i];
            pQ.offer(enemy[i]);
            if(n<0) {
                if(k>0) {
                    int pollNum = pQ.poll();
                    n += pollNum;
                    k--;
                }
                else {
                    break;
                }
            }
            answer++;
        }
        
        return answer;
    }
}