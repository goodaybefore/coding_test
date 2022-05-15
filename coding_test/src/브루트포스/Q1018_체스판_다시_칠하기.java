package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q1018_체스판_다시_칠하기 {
	public static boolean[][] board;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		board = new boolean[N][M];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			for(int j=0;j<M;j++) {
				if(str.charAt(j) == 'W') board[i][j] = true;
				else board[i][j] = false;
			}
		}
		
//		for(int i=0;i<N;i++) {
//			for(int j=0;j<M;j++) {
//				System.out.print(board[i][j]);
//			}
//			System.out.println();
//		}
//		
		
		//체스판 만들 수 있는 row, col을 반복문 돌리기
		int N_row = N-7;
		int M_col = M-7;
		
		for(int i=0;i<N_row;i++) {
			for(int j=0;j<M_col;j++) {
				find(i,j);
			}
		}
		

		System.out.println(min);
	}
	
	//(x,y)를 시작점으로 하는 8X8 체스판 찾기
	public static void find(int x, int y) {
		boolean check = board[x][y];
		int fixCnt = 0;
		
		for(int i=x;i<x+8;i++) {
			for(int j=y;j<y+8;j++) {
				if(check != board[i][j]) fixCnt++;
				check = !check;
			}
			check = !check;
		}

		fixCnt = Math.min(fixCnt, 64 - fixCnt);
		min = Math.min(min, fixCnt);
		//System.out.println("fixCnt : "+fixCnt);
	}

}
