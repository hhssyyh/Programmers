import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int X = Integer.parseInt(br.readLine());
	    
	    // 1번쨰: 1/1
	    // 2번째: 1/2
	    // 3번째: 2/1
	    // 4번째: 3/1
	    // 5번째: 2/2
	    // 6번째: 1/3
	    // 7번째: 1/4
	    
	    // 분자와 분모 합한 숫자가 1씩 늘어남.
	    // 해당 합이 될 수 있는 경우의 수만큼
	    // 합이 2 -> 1가지
	    // 합이 3 -> 2가지
	    // 합이 4 -> 3가지
	    // ... 가지수가 하나씩 늘어남.
	    // 1~n까지의 합에서 n이 몇일때
	    
	    int sum = 1;
	    int n = 1;
	    
	    while(sum<X) {
	    	n++;
	    	sum = sum+n;
	    }
	    
    	sum = sum-n;
    	n--;
	    
	    // 합이 n+2인 경우의 수 중 X-sum 번째
	    // n+2이 짝수이면 분자 1부터
	    // n+2이 홀수면 분자 n-1부터
	    int up = 1;
	    int down = 1;
	    if(n%2 != 0) {
	    	up = X-sum;
	    	down = n+1-(X-sum-1);
	    } else {
	    	up = n+1-(X-sum-1);
	    	down = X-sum;
	    }
	    
	    System.out.println(up + "/" + down);
    }
}