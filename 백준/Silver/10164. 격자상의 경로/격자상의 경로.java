import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] input = br.readLine().split(" ");
	    int N = Integer.parseInt(input[0]); // 행
	    int M = Integer.parseInt(input[1]); // 열
	    int K = Integer.parseInt(input[2]);
	    
	    long answer = 0;
	    
	    // factorial(공식) 사용없이 해보기. 사용하니까 부분성공만 뜸. 왜지?
	    // K==0과 K!=0 나눠야 함
	    // K!=0이라면 첫칸부터 K까지와 K부터 마지막까지를 나눠서
	    // 두 개의 경우의 수를 곱해주기
	    if(K==0) {
	    	answer = getWay(N, M);
	    } else {
	    	int n = (K-1) / M + 1;
	    	int m = (K-1) % M + 1;

	    	answer = getWay(n, m) * getWay(N-n+1, M-m+1);
	    }
	    
	    System.out.println(answer);
    }
    
    // n! 계산
    private static long factorial(int n) {
    	if(n == 0) return 1;
    	
    	long answer = 1;
    	for(int i = n; i>0; i--) {
    		answer *= i;
    	}
    	return answer;
    }
    
    // 행이 N, 열이 M인 이차배열의 첫 칸에서 마지막칸으로 갈 수 있는 경우의 수
    private static long getWay(int N, int M) {
    	Long[][] list = new Long[N][M];
    	
    	for(int i=0; i<N; i++) {
	    	for(int j=0; j<M; j++) {
	    		if(i==0 || j==0) {
	    			list[i][j] = (long)1;
	    		} else {
	    			list[i][j] = list[i-1][j] + list[i][j-1];
	    		}
	    	}
	    }
    	
    	return list[N-1][M-1];
    }
}