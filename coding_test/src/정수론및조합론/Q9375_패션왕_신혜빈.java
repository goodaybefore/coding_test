package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Q9375_패션왕_신혜빈 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		for(int k=0;k<T;k++) {
			Map<String, Integer> clothes = new HashMap<String, Integer>();
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				st = new StringTokenizer(br.readLine(), " ");
				String name = st.nextToken();
				String type = st.nextToken();
				clothes.put(type, clothes.getOrDefault(type, 0)+1);
			}
			int res = 1;
			var iter = clothes.values().iterator();
			while(iter.hasNext()) {
				res *= iter.next()+1;
			}
			sb.append(res-1).append("\n");
		}
		System.out.println(sb);
	}

}
