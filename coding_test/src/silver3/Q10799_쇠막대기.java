package silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Q10799_쇠막대기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		
		
		
		int sum  = 0;
		
		//stack 사용
//		Stack<Character> stack = new Stack<Character>();
//		for(int i=0;i<str.length();i++) {
//			char now = str.charAt(i);
//			
//			if(now == '(') {
//				stack.push(now); continue;
//			}
//			if(now == ')') {
//				stack.pop();
//				if(str.charAt(i-1) == '(') sum += stack.size();
//				else sum++;
//			}
//			
//		}
		
		//배열 사용
		sum = 0;
		int cnt = 0;
		for(int i=0;i<str.length();i++){
			char now = str.charAt(i);
			if(now == '(') cnt++;
			else {
				cnt--;
				if(str.charAt(i-1) == '(')
					sum += cnt;
				else sum++;
			}
		}
		
		
		
		bw.write(""+sum);
		bw.flush();
		bw.close();
		br.close();
		

	}

}
