class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        int index;
        String lastStr;
        
        for(String bab : babbling) {
            if(bab.contains("ayaaya") || bab.contains("yeye") || bab.contains("woowoo") || bab.contains("mama")) {continue;}
            for(String s : str) {
                if(bab.contains(s)) {bab = bab.replace(s, " ");}
            }
            
            if(bab.trim().equals("")) {
                answer++;
            }
        }
        
        return answer;
    }
}