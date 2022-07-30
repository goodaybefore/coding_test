package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q13305_주유소 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long roads[] = new long[N-1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N-1;i++) roads[i] =Long.parseLong(st.nextToken());
		long prices[] = new long[N];
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) prices[i] = Long.parseLong(st.nextToken());
		//roads : 도로 길이
		//prices : 리터당 가격
		
		long sum = 0;
		long minPrice = prices[0];
		
		for(int i=0;i<N-1;i++) {
			if(prices[i] < minPrice) minPrice = prices[i];
			sum += minPrice * roads[i];
		}
		System.out.println(sum);
		
	}

}
