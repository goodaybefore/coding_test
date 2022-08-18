package silver5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Q11728_배열합치기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str[] = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int size = N+M;
		int res[] = new int[size];
		
		String[] A = br.readLine().split(" ");
		String[] B = br.readLine().split(" ");
		
		int index = 0;
		for(int i=0;i<N;i++) res[index++] = Integer.parseInt(A[i]);
		for(int i=0;i<M;i++) res[index++] = Integer.parseInt(B[i]);
		Arrays.sort(res);
		
		for(int a : res) bw.write(String.valueOf(a)+" ");
		bw.flush();
		bw.close();
		br.close();

	}

}
