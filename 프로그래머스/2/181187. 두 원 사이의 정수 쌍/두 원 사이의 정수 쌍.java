class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
            
        for(int a=1; a<=r2; a++) {
            long minValue = (long) Math.ceil(Math.sqrt(Math.pow(r1,2) - Math.pow(a,2)));
            long maxValue = (long) Math.abs(Math.floor(Math.sqrt(Math.pow(r2,2) - Math.pow(a,2))));
            
            answer += Math.abs(maxValue - minValue) + 1;
        }
        answer = answer*4;
        
        return answer;
    }
}