package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1049_기타줄 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int pack = Integer.MAX_VALUE;
		int piece = Integer.MAX_VALUE;
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a < pack) pack = a;
			if(b < piece) piece = b;
		}
//		System.out.println("pack : "+pack);
//		System.out.println("piece : "+piece);
		
		
//		int packCnt = N/6;
//		int pieceCnt = N % 6;
//		int packPrice = Math.min(pack * (N/6), )
//		int piecePrice = Math.min(pack, pieceCnt * piece);
//		int sum = pack * (N/6) + piecePrice;
		System.out.println(Math.min(N * piece, Math.min((N/6) * pack + piece * (N%6), pack * (N/6 + 1))));
	
		

	}

}
