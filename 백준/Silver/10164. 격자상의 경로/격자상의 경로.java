import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] input = br.readLine().split(" ");
	    int N = Integer.parseInt(input[0]); // 행
	    int M = Integer.parseInt(input[1]); // 열
	    int K = Integer.parseInt(input[2]);
	    
	    long answer = 0;
	    
	    if(K == 0) {
	    	answer = factorial(N+M-2)/(factorial(N-1)*factorial(M-1));
	    } else {
	    	int n = K/M;
	    	int m = K%M;
	    	
	    	long x = factorial(n+m-1)/(factorial(n)*factorial(m-1));
	    	long y = factorial(N-n-1 + M-m)/(factorial(N-n-1)*factorial(M-m));
	    	
	    	answer = x*y;
	    }
	    
	    System.out.println(answer);
    }
    
    private static long factorial(int n) {
    	long answer = 1;
    	for(int i = n; i>0; i--) {
    		answer *= i;
    	}
    	return answer;
    }
}