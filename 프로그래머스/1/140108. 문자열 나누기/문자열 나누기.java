class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int a = 0;
        int b = 0;
        char ch;
        
        for(int i=0; i<s.length(); i++) {
            if(i!=s.length()-1) {
                ch = s.charAt(i);
                a++;
                while ((a!=b) && (i<s.length()-1)) {
                    i++;
                    if(ch == s.charAt(i)) {
                        a++;
                    } else {
                        b++;
                    }
                }
            }
            answer++;
        }
        
        return answer;
    }
}