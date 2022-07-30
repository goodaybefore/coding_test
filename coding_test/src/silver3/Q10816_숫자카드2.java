package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q10816_숫자카드2 {
	static int cards[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		cards = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) cards[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(cards);
		
		//숫자 몇개 가지고 있는지 확인
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<M;i++) {
			int key = Integer.parseInt(st.nextToken());
			//upperBound, lowerBound로 구현
			sb.append(upperBound(key) - lowerBound(key)).append(" ");
		}
//		System.out.println(Arrays.toString(cards));
		System.out.println(sb);
		

	}
	public static int lowerBound(int key) {
		int low = 0; int high = cards.length - 1;
		while(low < high) {
			int mid = low + (high - low)/2;
			if(key <= cards[mid]) high = mid;
			else low = mid + 1;
		}
		return low;
	}
	public static int upperBound(int key) {
		int low = 0; int high = cards.length;
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(key < cards[mid]) high = mid;
			else low = mid + 1;
		}
		return low;
	}

}
