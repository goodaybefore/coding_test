package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q17219_비밀번호찾기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, String> pwList = new HashMap<String, String>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String webAddress = st.nextToken();
			String pw = st.nextToken();
			pwList.put(webAddress, pw);
		}
		for(int i=0;i<M;i++) {
			String webAddress = br.readLine();
			sb.append(pwList.get(webAddress)).append("\n");
		}
		System.out.println(sb);
		
	}

}
