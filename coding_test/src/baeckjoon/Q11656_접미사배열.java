package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Q11656_접미사배열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String arr[] = new String[str.length()];
		
		arr[0] = str;
		for(int i=1;i<arr.length;i++) {
			arr[i] = arr[i-1].replaceFirst(String.valueOf(arr[i-1].charAt(0)), "");
		}
		
		Arrays.sort(arr);
		for(String s:arr) {
			System.out.println(s);
		}
	}

}
