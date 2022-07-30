package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q17218_비밀번호만들기__틀림_________ {
	static String dp[][];//dp[i][j] : s1의 0~i번째, s2의 0~j번째 까지 중 가장 긴 공통 문자 배열을 저장
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String s2 = br.readLine();
		dp = new String[s1.length()][s2.length()];
		
		//i나 j에 0이 들어갈 경우를 미리 세팅
		boolean check = false;
		//1) 모든 s1의 char과 s2의 0번째와 비교
		for(int i=0;i<s1.length();i++) {
			char char1 = s1.charAt(i);
			if(char1 == s2.charAt(0) || check) {
				dp[i][0] = Character.toString(char1);
				check = true;
			}
			else dp[i][0] = "";
		}
		check = false;
		//2) 모든 s2의 char과 s2의 0번째와 비교
		for(int i=0;i<s2.length();i++) {
			char char2 = s2.charAt(i);
			if(char2 == s1.charAt(0) || check) {
				dp[0][i] = Character.toString(char2);
				check = true;
			}
			else dp[0][i] = "";
		}
		
		for(int i=1;i<s1.length();i++) {
			for(int j=1;j<s2.length();j++) {
				char char1 = s1.charAt(i);
				char char2 = s2.charAt(j);
				
				//뽑아낸 문자가 서로 일치하면 이전의 (가장 긴)공통문자배열 뒤에다가 붙여줌 
				if(char1 == char2) {
//					dp[i][j] = dp[i-1][j-1] == null ? Character.toString(char1) : dp[i-1][j-1] + Character.toString(char1);
					dp[i][j] = dp[i-1][j-1] + Character.toString(char1);
				}
				//일치하지 않는다면 직전의 두 문자열 중 더 긴 문자열을을 dp[i][j]에 저장
				else {
					if(dp[i-1][j].length() < dp[i][j-1].length())
						dp[i][j] = dp[i][j-1];
					else dp[i][j] = dp[i-1][j]; 
				}
			}
			
		}
		System.out.println(dp[s1.length()-1][s2.length()-1]);
		
	}

}
