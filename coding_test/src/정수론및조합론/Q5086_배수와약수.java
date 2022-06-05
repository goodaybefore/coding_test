package 정수론및조합론;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086_배수와약수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(true) {
			st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a == 0 && b == 0) break;
			
			//1. a가 b의 약수인지 확인
			//2. b가 a의 약수인지 확인
			if(mineral(a, b) == "a") sb.append("factor").append("\n");
			else if(mineral(a, b) == "b") sb.append("multiple").append("\n");
			else sb.append("neither").append("\n");
		}
		System.out.println(sb);
	}
	public static String mineral (int a, int b) {
		
		if(b%a == 0) return "a";//a가 약수이다
		if(a%b == 0) return "b";//b가 약수이다
		
		return "none";
	}

}
