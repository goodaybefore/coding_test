package programmers;

import java.util.Arrays;
//최대공약수 최소공배수
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(solution(3, 12)));
	}
	public static int[] solution(int n, int m) {
        int[] answer = {};
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        answer = new int[2];
        answer[0] = gcd(max, min);
        answer[1] = lcm(max, min);
        return answer;
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static int lcm(int a, int b){
        return a*b / gcd(a,b);
    }
}
