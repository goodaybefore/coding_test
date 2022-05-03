package 기본수학2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q3009_네번째점 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Point> square = new ArrayList<Point>();
		int resX, resY;
		
		for(int i=0;i<3;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Point p = new Point(a, b);
			square.add(p);
		}
		
		if(square.get(0).x == square.get(1).x) resX = square.get(2).x;
		else if(square.get(1).x == square.get(2).x) resX = square.get(0).x;
		else resX = square.get(1).x;
		
		if(square.get(0).y == square.get(1).y) resY = square.get(2).y;
		else if(square.get(1).y == square.get(2).y) resY = square.get(0).y;
		else resY = square.get(1).y;
		
		
		System.out.println(resX + " "+resY);
	}
}


class Point {
	int x;
	int y;
	
	
	public Point(){
		x = 0;
		y = 0;
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(Point p) {
		return "x : "+p.x+", y : "+p.y;
	}
	
}


