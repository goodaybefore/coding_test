package programmers.Level1;

import java.util.HashMap;
import java.util.Map;
//포켓몬
public class Q2 {
	public static void main(String[] args) {
		int[] nums = {3,1,2,3};
		System.out.println(solution(nums));
	}
	public static int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++) {
        	map.put(nums[i], 1);
        }
        int n1 = map.keySet().size();
        int n2 = nums.length/2;
//        System.out.println(n1+", "+n2);
        return Math.min(n1, n2);
    }
	
}
