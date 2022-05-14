package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



public class Q7568_덩치 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int person[][] = new int[N][2];//[0] : 몸무게, [1] : 키
		String sp[];
		int rank[] = new int[N];
		for(int i=0;i<N;i++) {
			sp = br.readLine().split(" ");
			person[i][0] = Integer.parseInt(sp[0]);
			person[i][1] = Integer.parseInt(sp[1]);
		}
		
		for(int i=0;i<N;i++) {
			rank[i] = 1;
			
			for(int j=0;j<N;j++) {
				//나 자신이면 continue;
				if(i == j) continue;
				//i가 j보다 작을때마다 rank++해서 뒤로 미루기
				if(person[i][0]<person[j][0] && person[i][1]<person[j][1]) rank[i]++;
			}
		}

		for(int i=0;i<N;i++) {
			System.out.print(rank[i]+" ");
		}
		
//		for(int i=0;i<N;i++)
//			System.out.println(person[i][0]+" "+person[i][1]);
	}

}
