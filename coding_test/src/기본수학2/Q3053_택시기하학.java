package 기본수학2;

import java.util.Scanner;

public class Q3053_택시기하학 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		
		double euclid = Math.PI * R * R;
		double taxi = 2 * R * R;
		
		System.out.println(euclid);
		System.out.println(taxi);
	}

}
