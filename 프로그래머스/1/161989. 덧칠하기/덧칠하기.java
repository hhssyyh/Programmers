class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        for(int i=0; i<section.length; i++) {
            if(i!=section.length-1) {
                for(int j=i+1; j<section.length; j++) {
                    if(section[j]-section[i]>=m) {
                        answer++;
                        i=j-1;
                        break;
                    }
                }
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}