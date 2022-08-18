package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1094_막대기 {
	static int length = 64;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int stick = 64;
		int cnt = 0;
		while(X > 0) {
			if(stick > X) stick /= 2;
			else {
				cnt++;
				X -= stick;
			}
		}
		System.out.println(cnt);
	}

}
