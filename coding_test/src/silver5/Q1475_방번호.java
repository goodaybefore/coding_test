package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1475_방번호 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String room = br.readLine();
		
		int num[] = new int[10];
		for(int i=0;i<room.length();i++) {
			int c = room.charAt(i) - '0';
			if(c == 9) c = 6;
			num[c]++;
		}
		 num[6] = num[6]/2 + num[6]%2;
		 Arrays.sort(num);
		 System.out.println(num[9]);
		//틀렸음..왜징
//		for(int i=0;i<room.length();i++) {
//			int c = room.charAt(i) - '0';
//			System.out.print(c +" ");
//			if(c == 6 && num[c]) c = 9;
//			if(c == 9 && num[c]) c = 6;
//			if(num[c]) {
//				cnt++;
//				num = new boolean[10];
//				num[c] = true;
//			}else {
//				num[c] = true;
//			}
//		}
//		System.out.println(cnt);
	}

}
