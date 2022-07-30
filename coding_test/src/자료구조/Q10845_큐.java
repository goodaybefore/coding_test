package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10845_큐 {
	static int que[];
	static int start = 0;
	static int end = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		que = new int[N];
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
//				System.out.println("size : "+size());
				sb.append(size()).append("\n");
				break;
			case "empty":
//				System.out.println("empty : "+empty());
				sb.append(empty()).append("\n");
				break;
			case "front":
//				System.out.println("front: "+front());
				sb.append(front()).append("\n");
				break;
			case "back":
//				System.out.println("back: "+back());
				sb.append(back()).append("\n");
				break;
			}
//			System.out.println("que : "+Arrays.toString(que));
			
		}
		System.out.println(sb);
	}
	public static void push(int n) {
		que[end] = n;
		end++;
	}
	public static int pop() {
		if(end > start) {
			int n = que[start];
			que[start] = 0;
			start++;
			return n;
		}else return -1;
	}
	public static int size() {
		return end - start;
	}
	public static int empty() {
//		System.out.println("empty //  start : "+start+", end : "+end);
		
		if(start == end) return 1;
		else return 0;
	}
	public static int front() {
		if(start != end) return que[start];
		else return -1;
	}
	public static int back() {
		if(start != end) return que[end-1];
		else return -1;
	}

}
