import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    
	    int[][] work = new int[N][2];
	    int answer = 0;
	    
	    // 점수 순으로 sort
	    for(int i=0; i<N; i++) {
	    	String[] line = br.readLine().split(" ");
	    	work[i][0] = Integer.parseInt(line[0]); // 마감일
	    	work[i][1] = Integer.parseInt(line[1]); // 점수
	    }
	    
	    int[] done = new int[1001]; // 날짜별로 완료한 과제 -> 가장 오래걸리는 과제의 일수(sort해서 뽑는게 이득인가?)
	    
		// 점수 순으로 sort
	    Arrays.sort(work, (o1, o2) -> o2[1] - o1[1]); // 두번째 숫자 기준 내림차순
	    
	    // 점수 높은 것부터 배치
        for (int i = 0; i < N; i++) {
            int deadline = work[i][0]; // 마감일
            int score = work[i][1]; // 점수

            // 현재 마감일까지 할당할 수 있는 가장 늦은 날짜 찾기
            while (deadline > 0 && done[deadline] != 0) {
                deadline--;
            }

            // 빈 날짜가 있으면 배치
            if (deadline > 0) {
                done[deadline] = score;
                answer += score;
            }
        }
	    
	    System.out.println(answer);
    }
}