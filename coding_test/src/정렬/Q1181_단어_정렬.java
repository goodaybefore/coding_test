package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q1181_단어_정렬 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str[] = new String[N];
		
		for(int i=0;i<N;i++) {
			str[i] = br.readLine();
		}
		

		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				//compareTo : 기존값이 비교값보다 작으면 -1 반환, 같으면 0 반환, 크면 1반환
				if(s1.length() == s2.length()) return s1.compareTo(s2); //사전순정렬....
				else return s1.length() - s2.length();
			}
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]).append("\n");
		for(int i=1;i<N;i++) {
			if(!str[i].equals(str[i-1])) sb.append(str[i]).append("\n");
		}
		System.out.println(sb);
//		System.out.println(Arrays.toString(str));
		

	}

}
