package 기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;



public class Q1004_어린왕자 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int startX = Integer.parseInt(st.nextToken());
			int startY = Integer.parseInt(st.nextToken());
			int endX = Integer.parseInt(st.nextToken());
			int endY = Integer.parseInt(st.nextToken());
			Point start = new Point(startX, startY);
			Point end = new Point(endX, endY);
			
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			//행성들 입력받기
			for(int j=0;j<n;j++) {
				st = new StringTokenizer(br.readLine(), " ");
				//원의 x좌표, y좌표, 반지름(r)
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				Point circle = new Point(x, y);
				int r = Integer.parseInt(st.nextToken());
				if(isContain(circle, r, start) && isContain(circle, r, end)) {
					continue;
				}
				if(isContain(circle, r, start)) 
					count++;
				if(isContain(circle, r, end)) 
					count++;
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
	public static boolean isContain(Point circle, int r, Point point) {
		double distance = Math.sqrt(Math.pow(circle.x - point.x, 2) + Math.pow(circle.y - point.y, 2));
		if(distance <= r) {
			return true;
		}
		else return false;
	}

}
class Point{
	int x;
	int y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}