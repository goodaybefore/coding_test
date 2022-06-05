package 기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1358_하키 {
	static int W;
	static int H;
	static int X;
	static int Y;
	static int P;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		W = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		P = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		for(int i=0;i<P;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(isContains(a, b)) {
//				System.out.println("true point : "+a+", "+b);
				cnt++;
			}
		}
		System.out.println(cnt);
	}
	public static boolean isContains(int a, int b) {
		int fX, fY;
		double distance;
		int R = H/2;
		//왼쪽원 안에 있는지 검사
		if(a<=X && a>=X-R && b>=Y && b<=Y+H) {
			fX = X; fY = Y+ R; //왼쪽 원의 중심
			distance = Math.sqrt(Math.abs(Math.pow(a - fX, 2) + Math.pow(b - fY, 2)));
			if(distance <= R) return true;
			else return false;
		}
		//오른쪽 원 안에 있는지 검사
		else if(a<=X+W+R && a>= X+W && b>=Y && b<=Y+H) {
			fX = X+W; fY = Y+R;
			distance = Math.sqrt(Math.abs(Math.pow(a - fX, 2) + Math.pow(b - fY, 2)));
			if(distance <= R) return true;
			else return false;
		}
		//사각형 안에 있는지 검사
		else if(a>=X && a<=X+W && b>=Y && b<=Y+H) {
			return true;
		}
		else return false;
	}

}