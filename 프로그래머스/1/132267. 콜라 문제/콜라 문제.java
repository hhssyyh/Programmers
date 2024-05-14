class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int c;
        
        while(true) {
            c = (n/a)*b;
            n = n%a + c;
            answer += c;
            if(n<a) {
                break;
            }
        }
        
        return answer;
    }
}