import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int num = Integer.parseInt(br.readLine());
	    
	    ArrayList<Integer> factor = new ArrayList<Integer>();
	    int n = 2;
	    
	    while( num != 1 ) {
	        while(num%n == 0) {
	        	factor.add(n);
	        	num = num/n;
	        }
	        
	        n++;
	    }
	    
	    // 오름차순 정렬
	    Collections.sort(factor);
	    for(int f: factor) {
	    	System.out.println(f);
	    }
    }
}