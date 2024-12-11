import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    
    	ArrayList<String> answer = new ArrayList<String>();
    	
    	for(int i=0; i<T; i++) {
    		String[] inputs = br.readLine().split(" ");
    		int H = Integer.parseInt(inputs[0]);
    	    int W = Integer.parseInt(inputs[1]);
    	    int N = Integer.parseInt(inputs[2]);
    	    
    	    int h = 0;
    	    int w = 0;
    	    
    	    if(N%H == 0) {
    	    	h = H;
    	    	w = N/H;
    	    } else {
    	    	h = N%H;
    	    	w = N/H+1;
    	    }
    	    
	    	if(w<10) {
    	    	answer.add(h + "0" + w);
    	    } else {
    	    	answer.add(h + "" + w);
    	    }
    	    
    	}
    	
    	for(String a: answer) {
    		System.out.println(a);
    	}
    }
}