class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};
        int index;
        String lastStr;
        
        for(String bab : babbling) {
            index = 0;
            lastStr = "";
            while(true) {
                if(index==bab.length()) {
                    answer++;
                    break;
                } else if(index<=bab.length()-2
                   && (bab.substring(index,index+2).equals("ye") || bab.substring(index,index+2).equals("ma"))) {
                    
                    if(bab.substring(index,index+2).equals(lastStr)) {break;}
                    lastStr = bab.substring(index,index+2);
                    index += 2;
                } else if(index<=bab.length()-3
                          && (bab.substring(index,index+3).equals("aya") || bab.substring(index,index+3).equals("woo"))) {
                    
                    if(bab.substring(index,index+3).equals(lastStr)) {break;}
                    lastStr = bab.substring(index,index+3);
                    index += 3;
                } else {
                    break;
                }
            }
        }
        
        return answer;
    }
}