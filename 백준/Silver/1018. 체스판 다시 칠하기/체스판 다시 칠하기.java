import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] input = br.readLine().split(" ");
	    int N = Integer.parseInt(input[0]);
	    int M = Integer.parseInt(input[1]);
	    
	    boolean[][] chess = new boolean[N][M];
	    boolean[][] correctChess = new boolean[8][8];
	    
	    // 입력 받기
	    for(int i=0; i<N; i++) {
	    	String str = br.readLine();
	    	
	    	for(int j=0; j<M; j++) {
	    		if(str.charAt(j) == 'W') {
	    			chess[i][j] = true;
	    		} else {
	    			chess[i][j] = false;
	    		}
	    	}
	    }
	    
	    boolean b = true;

	    // 8*8 체스판 만들기
	    for(int i=0; i<8; i++) {
	    	for(int j=0; j<8; j++) {
	    		correctChess[i][j] = b;
	    		b = !b;
	    	}
	    	b = !b;
	    }
	    
	    int minsum = 64; // 최소값
	    // 완전 탐색
	    for(int i=0; i<=N-8; i++) {
	    	for(int j=0; j<=M-8; j++) {
	    		int sumT = 0; // 시작이 T인 배열과 다른 개수
	    	    int sumF = 0; // 시작이 F인 배열과 다른 개수
	    		
	    		for(int q=i; q<i+8; q++) {
	    			for(int k=j; k<j+8; k++) {
	    				if(chess[q][k] != correctChess[q-i][k-j]) { 
	    				    sumT++; 
	    				} else {
	    				    sumF++; 
	    				}
	    			}
	    		}
	    		
	    		
	    		int sum = sumT<sumF ? sumT:sumF;
	    		minsum = minsum<sum ? minsum:sum;
	    	}
	    }
	    
	    System.out.println(minsum);
    }
}