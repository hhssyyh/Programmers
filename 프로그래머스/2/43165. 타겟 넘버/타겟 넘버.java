class Solution {
    int answer = 0;
    int[] numbers;
    int target;
    public int solution(int[] numbers, int target) {
        this.numbers = numbers;
        this.target = target;
        getAnswer(0, 0);
        
        return answer;
    }
    
    public void getAnswer(int i, int sum) {
        if(i==numbers.length) {
            if(sum == target) answer++;
            return;
        }

        getAnswer(i+1, sum+numbers[i]);
        getAnswer(i+1, sum-numbers[i]);
    }
}