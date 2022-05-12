package 재귀;
//재귀가 전체적으로 너무 어려움...ㅠㅠ
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2447_별찍기_10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][N];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j] = " ";
			}
		}
		star10(arr, 0, 0, N);
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				bw.write(arr[i][j]+"");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
	public static void star10(String[][] arr, int x, int y, int N) {
		if(N == 1) {
			arr[x][y] = "*";
			return;
		}
		//9가 들어오면 3으로 나눠서 3만들기
		int newN = N/3;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(i==1 && j==1) continue; // (1,1)인 경우 blank여야 하므로 넘어가기
				//arr, x+(3*0~2)
				star10(arr, x+(newN*i), y+(newN*j), newN);
			}
		}
		
		
	}

}
