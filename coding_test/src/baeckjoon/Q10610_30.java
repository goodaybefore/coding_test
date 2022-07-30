package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class Q10610_30 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		LinkedList<Integer> number = new LinkedList<Integer>();
		StringBuilder sb = new StringBuilder();

		int sum = 0;
		for(int i=0;i<str.length();i++) {
			int n = str.charAt(i) - '0';
			sum += n;
			number.add(n);
		}
		
		Collections.sort(number, Collections.reverseOrder());
		
		//해당 숫자가 3의 배수라면
		if(sum % 3 == 0 && number.getLast() == 0) {
			for(int i:number) {
				sb.append(i);
			}
			System.out.println(sb);
		}else System.out.println(-1);
		
		
	}

}
