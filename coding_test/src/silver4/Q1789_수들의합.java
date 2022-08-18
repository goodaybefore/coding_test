package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1789_수들의합 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long S = Long.parseLong(br.readLine());
		
		long sum = 0;
		long n = 1;
		int cnt = 0;
		while(sum <= S) {
			sum +=n;
			n++;
			cnt++;
		}
		System.out.println(cnt - 1);
		
	}

}
