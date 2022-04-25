package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10757_큰수AplusB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String str_A = st.nextToken();
		String str_B = st.nextToken();
		
		//더 긴 숫자 길이 구하기
		int max_length = Math.max(str_A.length(), str_B.length());
		int[] A = new int[max_length+1];
		int[] B = new int[max_length+1];
		
		//A 초기화
		for(int i=str_A.length()-1, idx = 0;i>=0; idx++, i--) {
			A[idx] = str_A.charAt(i) - '0';
//			System.out.print(A[idx] +" ");
		}
		//B 초기화
		for(int i=str_B.length()-1, idx = 0;i>=0; idx++, i--) {
			B[idx] = str_B.charAt(i) - '0';
//			System.out.print(B[idx] +" ");
		}
		
		//계산 만들기
		int[] res = new int[max_length+1];
		boolean floor = false;
		for(int n=0;n<max_length+1;n++) {
			if(floor == true) res[n] = A[n] + B[n] +1;
			else res[n] = A[n] + B[n];
			floor = false;
			if(res[n]>=10) {
				floor = true;
				res[n] -= 10;
			}
		}
		if(res[max_length] == 0) {
			for(int i=res.length-2;i>=0;i--)
				System.out.print(res[i]);
		}else {
			for(int i=res.length-1;i>=0;i--)
				System.out.print(res[i]);
		}
		
		
	}

}
