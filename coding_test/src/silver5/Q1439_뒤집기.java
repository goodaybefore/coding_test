package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1439_뒤집기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int cnt = 0;
		char first = str.charAt(0);
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i) != first && str.charAt(i) != str.charAt(i-1)) cnt++;
		}
		System.out.println(cnt);
	}

}
