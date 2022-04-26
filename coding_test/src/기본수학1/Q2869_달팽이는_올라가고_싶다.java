package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2869_달팽이는_올라가고_싶다 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int day = (V-A)/(A-B)+1;
		//System.out.println("day : "+day);
		if((V-A)%(A-B)!=0) day++;
		System.out.println(day);
		
		
//		//아이패드 코테준비 문서 참고
//		Scanner sc = new Scanner(System.in);
//		int day = 0;
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		int V = sc.nextInt();
//		
//		day = (V-A)/(A-B)+1;
//		//System.out.println("day : "+day);
//		if((V-A)%(A-B)!=0) day++;
//		System.out.println(day);
//		
	}

}
