package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Q18258_큐2 {
	static LinkedList<Integer> que;
	static int start = 0;
	static int size;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		que = new LinkedList<Integer>();
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String func = st.nextToken();
			
			switch(func) {
			case "push":
				int x =Integer.parseInt(st.nextToken()); 
				push(x);
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size": 
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				sb.append(front()).append("\n");
				break;
			case "back":
				sb.append(back()).append("\n");
				break;
			}
//			System.out.println(que);
		}
		System.out.println(sb);
	}
	public static void push(int x) {
		que.offer(x);
		size++;
	}
	public static int pop() {
		if(size == 0) return -1;
		else {
			size--;
//			System.out.println(que);
			return que.remove(0);
		}
	}
	public static int size() {
		return size;
	}
	public static int empty() {
		if(size == 0) return 1;
		else return 0;
	}
	public static int front() {
		if(size == 0) return -1;
		else return que.get(0);
	}
	public static int back() {
		if(size == 0) return -1;
		else return que.get(size-1);
	}
}
