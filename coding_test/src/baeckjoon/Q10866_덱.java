package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Q10866_덱 {
	static LinkedList<Integer> dq;
	//맨 앞 가리킴
	static int front = 0;
	//dq의 사이즈
	static int size = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		dq = new LinkedList<Integer>();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			String func = st.nextToken();
			
			switch(func) {
			case "push_front":
				push_front(Integer.parseInt(st.nextToken()));
				break;
			case "push_back" :
				push_back(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				sb.append(pop_front()).append("\n");
				break;
			case "pop_back":
				sb.append(pop_back()).append("\n");
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
		}
		System.out.println(sb);
		
	}
	public static void push_front(int X) {
		dq.addFirst(X);
		size++;
	}
	public static void push_back(int X) {
		dq.addLast(X);
		size++;
	}
	public static int pop_front() {
		if(size == 0) return -1;
		size--;
		return dq.remove(front);
	}
	public static int pop_back() {
		if(size == 0) return -1;
		size--;
		return dq.remove(size);
	}
	public static int size() {
		if(size - front < 0) return -1;
		else return size-front;
	}
	public static int empty() {
		if(size == front) return 1;
		else return 0;
	}
	public static int front() {
		if(front == size) return -1;
		return dq.get(front);
	}
	public static int back() {
		if(size == 0) return -1;
		return dq.get(size-1);
	}
}
