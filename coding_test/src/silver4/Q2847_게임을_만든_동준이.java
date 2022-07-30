package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q2847_게임을_만든_동준이 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int score[] = new int[N];
		for(int i=0;i<N;i++) score[i] = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i=N-1;i>=1;i--) {
			if(score[i-1]>=score[i]) {
//				System.out.println("score[i-1] : " + score[i-1]+", score[i] : "+score[i]);
				cnt += score[i-1] - score[i] + 1;
				score[i-1] -= (score[i-1] - score[i]) + 1;
				
//				System.out.println("cnt : "+cnt);
//				System.out.println(Arrays.toString(score));
			}
		}
		
		System.out.println(cnt);

	}

}
