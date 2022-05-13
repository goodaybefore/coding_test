package 브루트포스;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2231_분해합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int M = 0;
		
		//1부터 N까지 분해합 다 만들어보기
		//분해합 임시 결과 : tmp
		//
		for(int i=1;i<=N;i++) {
			int num = i; //i에 변화를 줄 것이기 때문에 임시 변수(num)에 넣어줌
			int tmp = 0;
			
			//i의 자릿수를 모두 더해서 분해합 임시결과에 집어넣기
			while(num != 0) {
				tmp += num%10;//10으로 나눈 나머지 삽입
				num /= 10;//다음 자릿수를 찾기위해 num을 나눠주기
			}
			
			if(tmp + i == N) { //만약 각자릿수합+현재숫자(i)의 합이 N과 같을경우 break;
				M = i;
				break;
			}
		}
		System.out.println(M);
	}

}
