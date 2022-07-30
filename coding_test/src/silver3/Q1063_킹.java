package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1063_킹 {
	static boolean[][] chess = new boolean[8][8];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		char[] k = st.nextToken().toCharArray();
		char[] s= st.nextToken().toCharArray();
		int N = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<N;i++) {
			String cmd = br.readLine();
			char[] nextKing = k.clone();
			char[] nextStone = s.clone();
			move(cmd, nextKing);
			if(range(nextKing)) continue;
			if(Arrays.equals(nextKing, nextStone)) {
				move(cmd, nextStone);
				if(range(nextStone)) continue;
			}
			k = nextKing;
			s = nextStone;
		}
		System.out.println(k);
		System.out.println(s);
		
	}
	
	public static void move(String move, char[] next) {
		
		switch(move) {
		case "R": next[0]++; break;
		case "L" : next[0]--; break;
		case "B" : next[1]--; break;
		case "T" : next[1]++; break;
		case "RT" : next[0]++; next[1]++; break;
		case "LT" : next[0]--; next[1]++; break;
		case "RB" : next[0]++; next[1]--; break;
		case "LB" :next[0]--; next[1]--;  break;
		}
	}
	
	public static boolean range(char[] next) {
		return next[0]<'A' || next[0] > 'H' || next[1] < '1' || next[1] > '8';
	}

}
