import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
    	ArrayList<Integer> answer = new ArrayList<Integer>();
    	
    	for(int i=0; i<N; i++) {
    		String isCorrect = br.readLine();
    		int sum = 0;
    		int count = 1;
    		
    		for(int j=0; j<isCorrect.length(); j++) {
    			if(isCorrect.charAt(j) == 'O') {
    				sum += count;
    				count++;
    			} else {
    				count = 1;
    			}
    		}
    		
    		answer.add(sum);
    	}
    	
    	for(int a: answer) {
    		System.out.println(a);
    	}
    }
}