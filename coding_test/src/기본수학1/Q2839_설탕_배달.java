package 기본수학1;

import java.util.Scanner;

public class Q2839_설탕_배달 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Nkg = sc.nextInt();
		int res = 0;
		int totalOf3 = 0;
		int totalOf5 = 0;
		boolean possible = false;
		int cnt = 1;
		if(Nkg%5==0) {
			res = Nkg/5;
		}else {
			while(Nkg>=cnt*3) {
				//System.out.println("cnt :"+cnt);
				//System.out.println("Nkg :"+Nkg);
				if((Nkg-3*cnt)%5==0) {
					possible = true;
					totalOf3 = cnt;
					totalOf5 = (Nkg-3*cnt)/5;
					//System.out.println("3 : "+totalOf3);
					//System.out.println("5 : "+totalOf5);
					break;
				}
				cnt++;
			}
			res = totalOf3 + totalOf5;
			if(possible == false) {
				res = -1;
			}
		}
		System.out.println(res);
	}

}
