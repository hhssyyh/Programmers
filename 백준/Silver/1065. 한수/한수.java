import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    int sum = 99;
	    
	    // 100 미만의 숫자는 모두 한수
	    // N이 100 미만의 수라면 해당 숫자 바로 출력
	    // 100 ~ N 사이에 몇개의 한수가 존재하는지
	    
	    if( N/10 < 10 ) {
	    	System.out.println(N);
	    } else if(N == 100) {
	    	System.out.println("99");
	    } else {
	    	while(N>100) {
	    		if(N==1000) N--;
	    		
	    		int hund = N/100;
		    	int ten = (N%100)/10;
		    	int one = (N%10);
		    	
		    	if((hund-ten) == (ten-one)) {
		    		sum++;
		    	}
		    	
		    	N--;
	    	}
	    	
	    	System.out.println(sum);
	    }
    }
}