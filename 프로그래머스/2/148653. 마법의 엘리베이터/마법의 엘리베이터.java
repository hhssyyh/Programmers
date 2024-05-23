class Solution {
    public int solution(int storey) {
        int answer = 0;
        int count = 0;
        int num = storey;
        
        while(num>0) {
            num /= 10;
            count++;
        }
        
        for(int i=0; i<=count; i++) {
            int f = (int) Math.pow(10, i);
            
            if(storey%(f*10) == 0) continue;
            
            if(storey%(f*10) < 5*f) {
                answer += (storey%(f*10))/f;
                storey -= storey%(f*10);
            } else if(storey%(f*10) == 5*f){
                answer += 5;
                if(storey%(f*100) < 50*f) {
                    storey -= 5*f;
                } else {
                    storey += 5*f;
                }
            } else {
                answer += ((f*10)-storey%(f*10))/f;
                storey += (f*10)-storey%(f*10);
            }
            
            if(storey<=0) break;
        }
        
        return answer;
    }
}