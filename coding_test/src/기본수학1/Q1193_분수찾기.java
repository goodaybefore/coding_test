package 기본수학1;

import java.util.Scanner;

public class Q1193_분수찾기 {

	public static void main(String[] args) {
		//분수 찾기
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		int denominator = 0;
		int numerator = 0;
		int line = 0;
		
		while(N>cnt) {
			line++;
			cnt = line*(line+1)/2;
		}
		//System.out.println("line : "+line+", cnt : "+cnt);
		int num = cnt - N;
		if(line%2!=0) {
			numerator = 1 + num;
			denominator = line - num;
		}else {
			numerator = line - num;
			denominator = 1 + num;
		}
		
		//System.out.println("분자/분모 : "+numerator+"/"+denominator);
		System.out.println(numerator+"/"+denominator);
		

	}

}
