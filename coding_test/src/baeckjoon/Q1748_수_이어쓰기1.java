package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1748_수_이어쓰기1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//길이
		int len = 10;
		//자릿수
		int cnt = 1;
		int answer = 0;
		for(int i=1;i<=N;i++) {
			if(i % len == 0) {
				len *= 10;
				cnt++;
//				System.out.println("len : "+len);
//				System.out.println("cnt : "+cnt);
			}
//			System.out.println(answer +" + "+cnt +" = "+ (answer+cnt));
			answer += cnt;
			
		}
		System.out.println(answer);
	}

}
