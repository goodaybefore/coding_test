package backjoon;

import java.util.Scanner;

public class Q2292_벌집 {
	public static void main(String[] args) {
		/* 숫자 N이 주어졌을 때 벌집 중앙(1)에서 N번 까지 도착할 때
		 * 몇 개의 방을 지나가는지 계산하는 프로그램 (시작방~끝방 포함) */
		//풀기가 힘들어서 풀이의 도움을 받았다
		// 굿노트 코테준비 노트 참고
		
		Scanner sc = new Scanner(System.in);
		//System.out.println("숫자(N)를 입력하세요 : ");
		int N  = sc.nextInt();
		
		int sumF = 2; //시작숫자
		int sumL = 7; //끝숫자
		int cnt = 1; //필요 칸수
		while(true) {
			//숫자범위 조건에 만족할때
			if(N == 1) break;
			if(N>=sumF && N<=sumL) break;
			System.out.println("cnt : "+cnt+", sumFirst : "+sumF + ", sumLast : "+sumL);
			cnt ++;
			sumF += (6 * (cnt-1));
			sumL += (6*cnt);
		}
		
		
		if(N==1) System.out.println(cnt);
		else System.out.println(++cnt);
		
		
		
	}
}
