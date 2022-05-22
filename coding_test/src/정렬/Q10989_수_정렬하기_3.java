package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//Counting Sort
public class Q10989_수_정렬하기_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int cnt[] = new int[10001]; //1부터 10000까지의 숫자를 담을 수 있는 숫자배열
		//들어오는 숫자를 cnt에 출력
		for(int i=0;i<N;i++) cnt[Integer.parseInt(br.readLine())]++;
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1;i<cnt.length;i++) {
			while(cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
		}
		
		System.out.println(sb);
	}

}
