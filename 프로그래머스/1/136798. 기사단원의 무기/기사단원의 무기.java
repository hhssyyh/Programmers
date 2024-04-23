class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int kg;
        
        for(int i=1; i<number+1; i++) {
            kg = 0;
            for(int j=1; j*j<=i; j++) {
                if(j*j == i) {kg++;} 
                else if(i%j == 0) {kg += 2;}
                
                if(kg>limit) {
                    break;
                }
            }
            if(kg>limit) {
                answer += power;
            } else {
                answer += kg;
            }
        }
        
        return answer;
    }
}