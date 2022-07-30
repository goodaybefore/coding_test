package silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1476_날짜계산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int E = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int e  = 0;
		int s = 0;
		int m = 0;
		int cnt = 0;
		
		while(E != e || S!= s || M !=m) {
			e++; s++; m++; cnt++;
			if(e == 16) e = 1;
			if(s == 29) s = 1;
			if(m == 20) m = 1;
//			System.out.println(e+" "+s+" "+m+" : "+cnt);
//			if(cnt == 17) break;
		}
		
		System.out.println(cnt);
	}

}
