package programmers.Level1;

import java.util.ArrayList;
import java.util.List;

public class Q없는숫자_더하기 {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		System.out.println(solution(numbers));
	}
	public static int solution(int[] numbers) {
		int answer = 0;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<numbers.length;i++) list.add(numbers[i]);
		for(int i=1;i<=9;i++) if(!list.contains(i)) answer += i;
		return answer;
	}
}
