package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1436_영화감독_숌 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
//		String numStr = Integer.toString(N);
		int num = 666;
		int cnt = 1;
		
		int answer = 0;
		while(true) {
			//N일때까지 구하기
			String numStr = Integer.toString(num);
			//666이 들어가면 cnt++;
			if(numStr.contains("666")) {
//				System.out.println(numStr + " : 일치함");
				if(cnt == N) {
					answer = Integer.parseInt(numStr);
					break;
				}
				cnt++;
				
			}
			num = Integer.parseInt(numStr) + 1;
		}
		System.out.println(answer); 
		
		
		
	}

}
