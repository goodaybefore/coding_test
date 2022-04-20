package backjoon;

import java.util.Scanner;

/*
 * 매년 A만원의 고정비용, B만원의 가변비용, 판매가격 C만원
 * A + B < C가 되는 지점을 구하는 프로그램
 * */
public class Q1712 {

	public static void main(String[] args) {
		//풀이방법 : 매년 N대 생산하다고 가정, 버림(A(C-B)+1)
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		
		
		
		int n = getBreakEvenPoint(a, b, c);
		System.out.println(n);
	}
	public static int getBreakEvenPoint(double a, double b, double c) {
		int calcVal = 0;
		if(b>=c) return -1;
		else {
			calcVal = (int)Math.floor(a/(c-b)+1);
		}
		
		return calcVal;
	}

}
