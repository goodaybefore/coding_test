package 기본수학2;

import java.util.Scanner;

public class Q1085_직사각형에서_탈출 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int length[] = new int[4];
		length[0] = Math.abs(y);
		length[1] = Math.abs(x);
		length[2] = Math.abs(w - x);
		length[3] = Math.abs(h - y);
		
		int min = length[0];
		for(int i=0;i<length.length;i++) {
			//System.out.println("length["+i+"] : "+length[i]);
			if(min > length[i]) min = length[i];
		}
		System.out.println(min);

	}

}
