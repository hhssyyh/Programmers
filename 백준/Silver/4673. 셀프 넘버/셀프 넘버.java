import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

//	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	    String[] inputs = br.readLine().split(" ");

    	ArrayList<Integer> ar = new ArrayList<Integer>();
    	
    	for(int i=1; i <= 10000; i++) {
    		ar.add(i);
		}
    	
    	int removeInt = 0;
    	for(int i=1; i<=10000; i++) {
    		if(i<10) {
    			removeInt = i+i;
    		} else if(i<100) {
    			removeInt = i + i%10 + i/10;
    		} else if(i<1000) {
    			removeInt = i + i%10 + (i%100)/10 + i/100;
    		} else {
    			removeInt = i + i%10 + (i%100)/10 + (i%1000)/100 + i/1000;
    		}
    		
    		ar.remove((Integer)removeInt);
    	}
    	
    	for(int a: ar) {
    		System.out.println(a);
    	}
    }
}