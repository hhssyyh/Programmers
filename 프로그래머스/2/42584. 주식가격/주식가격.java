class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int sum;
        
        for(int i=0; i<prices.length; i++) {
            sum = 0;
            for(int j=i+1; j<prices.length; j++) {
                sum++;
                if(prices[i]>prices[j]) {
                    break;
                }
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}