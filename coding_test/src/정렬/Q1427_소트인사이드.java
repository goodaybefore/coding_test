package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1427_소트인사이드 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cnt[] = new int[10];
		
		while(N != 0) {
//			System.out.println(N%10);
			cnt[N%10]++;
			N /= 10;
		}
		
//		System.out.println(Arrays.toString(cnt));
		for(int i=9;i>=0;i--){
			for(int j=cnt[i];j>0;j--) {
				System.out.print(i);
			}
		}
	}

}
