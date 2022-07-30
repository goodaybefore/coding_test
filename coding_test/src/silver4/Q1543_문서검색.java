package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Q1543_문서검색 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char[] document = br.readLine().toCharArray();
//		char[] word = br.readLine().toCharArray();
		String document = br.readLine();
		String word = br.readLine();
		
		String do2 = document.replace(word, "");
		
		System.out.println((document.length() - do2.length()) / word.length());
		
		
		
		
	}

}
