class Solution {
    public long solution(int k, long d) {
        long answer = 0;
        
        for(long i=0; i<=d; i+=k) {
            long b = d*d - i*i;
            double result = Math.sqrt(b);
            answer += ((long)result)/k;
            answer++;
        }
        
        return answer;
    }
}