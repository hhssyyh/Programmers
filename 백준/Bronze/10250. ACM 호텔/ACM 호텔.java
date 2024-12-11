import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    
    	StringBuilder answer = new StringBuilder();
    	
    	for(int i=0; i<T; i++) {
    		String[] inputs = br.readLine().split(" ");
    		int H = Integer.parseInt(inputs[0]);
    	    int N = Integer.parseInt(inputs[2]);
	    	
	    	if(N%H == 0) {
	    		answer.append(H*100 + N/H + "\n");
	    	} else {
	    		answer.append((N%H)*100 + (N/H+1) + "\n");
	    	}
    	    
    	}
    	
    	System.out.println(answer);
    }
}