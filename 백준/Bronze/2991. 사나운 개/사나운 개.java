import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    String[] DTime = br.readLine().split(" "); // 개 두마리의 공격적, 차분한 시간
	    String[] PTime = br.readLine().split(" "); // 배달원들 도착 시간
	    int dog1_ag = Integer.parseInt(DTime[0]); // 개1 공격적인 시간
	    int dog1_ca = Integer.parseInt(DTime[1]); // 개2 조용한 시간
	    int dog2_ag = Integer.parseInt(DTime[2]); // 개1 공격적인 시간
	    int dog2_ca = Integer.parseInt(DTime[3]); // 개2 조용한 시간
	    
	    // 각 우체부 별 도착시간에 공격적인 개
	    for(String ptime : PTime) {
	    	int p = Integer.parseInt(ptime);
	    	int attack = 0;
	    	
	    	int isAgg = p%(dog1_ag + dog1_ca);
	    	if(isAgg != 0 && isAgg <= dog1_ag) { attack++; }
	    	
	    	isAgg = p%(dog2_ag + dog2_ca);
	    	if(isAgg != 0 && isAgg <= dog2_ag) { attack++; }
	    	
	    	System.out.println(attack);
	    }
    }
}