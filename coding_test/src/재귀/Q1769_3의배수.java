package 재귀;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1769_3의배수 {
	static int cnt = 0;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = br.readLine();
		
		checkMultiple(X);
		
		System.out.println(sb);
		
	}
	public static void checkMultiple(String str) {
		int Y = 0;
		if(str.length() < 2) {
			Y = Integer.parseInt(str);
			sb.append(cnt).append("\n");
			if(Y % 3 == 0) sb.append("YES");
			else sb.append("NO");
			return;
		}
		
		//str.charAt(i)의 결과값은 <문자열>로 나온다.
		//이것을 숫자형으로 바꿔주려면 '0'(48)을 빼주면 된당
		for(int i=0;i<str.length();i++) Y += str.charAt(i) - '0'; 
		str = String.valueOf(Y);
		cnt++;
		checkMultiple(str);
		
	}

}
