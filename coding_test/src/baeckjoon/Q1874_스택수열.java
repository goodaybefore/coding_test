package baeckjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q1874_스택수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		//Stack
		Stack<Integer> stack = new Stack<Integer>();
		
		//1~T까지 순환해줄 숫자
		int start = 0;
		while(T-- > 0) {
			int val = Integer.parseInt(br.readLine());
			if(start < val) {
				for(int i=start+1; i<=val; i++) {
					stack.push(i);
					sb.append('+').append("\n");
				}
				start = val;
			}
			else if(stack.peek() != val) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append('-').append("\n");
		}
		System.out.println(sb);
	}

}
