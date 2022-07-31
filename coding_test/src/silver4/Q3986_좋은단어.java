package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q3986_좋은단어 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Character> stack;
		int cnt = 0;
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			stack = new Stack<Character>();
			
			for(int j=0;j<str.length();j++) {
				char c = str.charAt(j);
				if(stack.isEmpty()) {
					stack.push(c);
					continue;
				}
				if(c == stack.peek()) stack.pop();
				else stack.push(c);
			}
			if(stack.isEmpty()) cnt++;
		}
		System.out.println(cnt);

	}

}
