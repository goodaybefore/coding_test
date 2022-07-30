package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q9012_괄호 {
	static Stack<Character> stack;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T =  Integer.parseInt(br.readLine());
		String[] strs = new String[T];
		for(int i=0;i<T;i++) strs[i] = br.readLine();
		
		StringBuilder sb = new StringBuilder();
		for(String str : strs) {
			stack = new Stack<Character>();
			//NO인지 YES인지 판별하는 함수
			if(isCorrect(str)) sb.append("YES").append("\n");
			else sb.append("NO").append("\n");
		}
		System.out.println(sb);
	}
	public static boolean isCorrect(String s) {
		for(char c : s.toCharArray()) {
			if(c == '(') stack.push(c);
			else {
				if(stack.isEmpty()) return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}

}
