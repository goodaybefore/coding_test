package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q17413_단어뒤집기2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		Stack<Character> stack = new Stack<Character>();
		StringBuilder sb = new StringBuilder();
		boolean flag = false;// < 과 > 판별(< : true, > : false)
		
		for(int i=0;i<sentence.length();i++) {
			char now = sentence.charAt(i);
			if(now == '<') {
				while(!stack.isEmpty()) sb.append(stack.pop());
				flag = true;
			}
			else if(now == '>') {
				flag = false;
				sb.append(now);
				continue;
			}
			
			if(flag) sb.append(now);
			else {
				if(now == ' ') {
					while(!stack.isEmpty()) sb.append(stack.pop());
					sb.append(' ');
					continue;
				}
				else stack.push(now);
			}
			
			if(i == sentence.length()-1)
				while(!stack.isEmpty()) sb.append(stack.pop());
		}
		
		
		System.out.println(sb);
	}
}
