package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1259_팰린드롬수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "a";
		while(true) {
			str = br.readLine();
			if(str.charAt(0) == '0') break;
//			System.out.println(str);
			if(palindrome(str)) System.out.println("yes");
			else System.out.println("no");
		}
		
		
		
	}
	public static boolean palindrome(String str) {
		for(int i=0;i<str.length()/2+1;i++) {
			char front = str.charAt(i);
			char back = str.charAt(str.length()-(i+1));
			if(front != back) return false;
		}
		return true;
	}

}
