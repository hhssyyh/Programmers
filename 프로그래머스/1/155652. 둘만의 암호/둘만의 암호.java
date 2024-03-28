import java.util.*;

class Solution {
    public static int getAbcIndex(char[] abc, char ch) {
        for(int i=0; i<abc.length; i++) {
            if(abc[i] == ch) {
                return i;
            }
        }
        return -1;
    }
    
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] abc = new char[26-skip.length()];
        int j = 0;
        int get_index;
        
        for(int i=0; i<26; i++) {
            if (!skip.contains(String.valueOf((char)(97+i)))) {
                abc[j] = (char)(97+i);
                j++;
            }
        }
        
        for(int i=0; i<s.length(); i++) {
            get_index = getAbcIndex(abc, s.charAt(i))+index;
            if(get_index<abc.length) {
                answer += abc[get_index];
            } else {
                answer += abc[get_index % abc.length];
            }
        }
        
        return answer;
    }
}