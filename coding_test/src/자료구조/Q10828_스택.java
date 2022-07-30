package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q10828_스택 {
	static int[] stack;
	static int size = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		stack = new int[N];
		
		while(N != 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String func = st.nextToken();
			switch(func){
				case "push":
					int num = Integer.parseInt(st.nextToken());
					push(num);
					break;
				case "pop":
					sb.append(pop()).append("\n");
					break;
				case "size":
					sb.append(size).append("\n");
					break;
				case "empty":
					sb.append(empty()).append("\n");
					break;
				case "top":
					sb.append(top()).append("\n");
					break;
			}
			N--;
		}
		
		System.out.println(sb);
	}
	public static void push(int X) {
		stack[size] = X;
		size++;
	}
	public static int pop() {
		if(size == 0) return -1;
		else {//size-1 해주는 이유 : 현재의 size는 "push가 왔을 때 들어갈" 배열의 자리이므로!!
			int res = stack[size-1];
			stack[size-1] = 0;
			size--;
			return res;
		}
	}
	public static int empty() {
		if(size == 0) return 1;
		else return 0;
	}
	public static int top() {
		if(size == 0) return -1;
		else return stack[size-1];
	}
}
