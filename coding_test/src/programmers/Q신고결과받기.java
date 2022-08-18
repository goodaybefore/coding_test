package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Q신고결과받기 {

	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String report[] = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		System.out.println(Arrays.toString(solution(id_list, report, k)));

	}
	public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // [신고된ID / [신고한ID들]]
        Map<String, HashSet<String>> reported = new HashMap<>();
        // [신고된ID / 메일 수]
        Map<String, Integer> ans = new HashMap<>();
        
        return answer;
    }
}
