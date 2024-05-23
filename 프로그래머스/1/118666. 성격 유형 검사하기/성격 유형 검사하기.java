import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> sum = new HashMap<>();
        
        for(int i=0; i<survey.length; i++) {
            if(choices[i]<4) {
                char key = survey[i].charAt(0);
                sum.put(key, sum.getOrDefault(key, 0) + (4-choices[i]));
            } else if(choices[i]>4) {
                char key = survey[i].charAt(1);
                sum.put(key, sum.getOrDefault(key, 0) + (choices[i]-4));
            }
        }
        
        answer += sum.getOrDefault('R', 0)<sum.getOrDefault('T', 0) ? "T" : "R";
        answer += sum.getOrDefault('C', 0)<sum.getOrDefault('F', 0) ? "F" : "C";
        answer += sum.getOrDefault('J', 0)<sum.getOrDefault('M', 0) ? "M" : "J";
        answer += sum.getOrDefault('A', 0)<sum.getOrDefault('N', 0) ? "N" : "A";
        
        return answer;
    }
}