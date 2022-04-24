package backjoon;

import java.util.Scanner;

public class Q2775_부녀회장이_될테야 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int[][] APT = new int[15][15];
		int res[] = new int[T];

		for(int i=0;i<APT.length;i++) {
			APT[0][i] = i;
			APT[i][1] = 1;
		}
		for(int k=1;k<APT.length;k++) {
			for(int n=2;n<APT.length;n++) {
				APT[k][n] = APT[k][n-1] + APT[k-1][n];
			}
		}
		
		for(int i=0;i<res.length;i++) {
			int kInput = sc.nextInt();
			int nInput = sc.nextInt();
			res[i] = APT[kInput][nInput];
		}
		
		
		for(int tmp:res) {
			System.out.println(tmp);
		}
		//APT 출력
//		for(int i=0;i<APT.length;i++) {
//			System.out.println(Arrays.toString(APT[i]));
//		}
//		
		
		
	}

}
