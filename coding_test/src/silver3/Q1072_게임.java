package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1072_게임 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int Z = winningRate(X, Y);
		
		int ans = -1;
		int left = 0;
		int right = (int)1e9;
		
		while(left <= right) {
			int mid = (left + right)/2;
			if(winningRate(X+mid, Y+mid) != Z) {
				ans = mid;
				right = mid - 1;
			} else left = mid + 1;
		}
		System.out.println(ans);
		
	}
	public static int winningRate(int X, int Y) {
		return (int)(((long)Y * 100)/X);
	}
	
}
