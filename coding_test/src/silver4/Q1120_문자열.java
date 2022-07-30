package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1120_문자열 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String A = st.nextToken();
		String B = st.nextToken();
		
		
		int miss = A.length();
		for(int i=0;i<=B.length()-A.length();i++) {
			int tmp = 0;
			for(int j=0;j<A.length();j++) {
				System.out.println("A.charAt("+j+") : "+A.charAt(j));
				System.out.println("B.charAt("+j+"+"+"i"+") : "+B.charAt(j));
				System.out.println();
				if(A.charAt(j) != B.charAt(j+i)) tmp++;
			}
			if(miss > tmp) miss = tmp;
		}
		System.out.println(miss);

	}

}
