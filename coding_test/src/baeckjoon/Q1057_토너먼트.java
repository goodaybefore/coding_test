package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q1057_토너먼트 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int N = Integer.parseInt(st.nextToken());
		double jimin = Integer.parseInt(st.nextToken());
		double hansu = Integer.parseInt(st.nextToken());
		
		
		int round = 0;
		while(hansu - jimin != 0) {
			jimin = Math.round(jimin / 2);
			hansu = Math.round(hansu / 2);
			round++;
		}
		System.out.println(round);

	}
}
