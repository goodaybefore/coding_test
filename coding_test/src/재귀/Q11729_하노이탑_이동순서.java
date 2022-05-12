package 재귀;

import java.util.Scanner;
//StringBulider sb = new StringBulder(); 가 뭔지 알아야 할듯
//인터넷강의보고 간신히 이해..(하노이 코딩 으로 검색하면 나옴)

public class Q11729_하노이탑_이동순서 {
	public static int cnt = 0;
	public static StringBuilder sb = new StringBuilder();
	
	public static void moveHanio(int n, int from, int mid, int to) {
//		System.out.println("from : "+from+", mid : "+mid + ", to : "+to);
		cnt++;
		if(n == 1) {
			sb.append(from + " " + to + "\n");
//			System.out.println(sb);
			return;
		}
		
		moveHanio(n-1, from, to, mid);
		sb.append(from + " " + to+"\n");
		moveHanio(n-1, mid, from, to);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		moveHanio(n, 1, 2, 3);
		System.out.println(cnt);
//		sb.insert(0, cnt+ "\n");
//		System.out.println("sb : "+ sb);
		System.out.println(sb);
	}

}
