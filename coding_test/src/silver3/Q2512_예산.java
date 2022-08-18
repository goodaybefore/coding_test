package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2512_예산 {

	static int n;
    static int[] budget;
    static int maxBudget;
    static int sum = 0;

    public static void main(String[] args) throws IOException {

        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        n = Integer.parseInt(s);
        budget = new int[n];

        s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");

        for (int i = 0; i < n; i++) {
            budget[i] = Integer.parseInt(st.nextToken());
            sum += budget[i];
        }

        s = br.readLine();
        maxBudget = Integer.parseInt(s);
        // input end

        // 최대값 뽑아내기 쉽도록 정렬
        Arrays.sort(budget);

        System.out.println(binarySearch());
    }

    static int binarySearch() {

        // 예산을 그냥 줄 수 있으면 바로 반환
        if (sum <= maxBudget) {
            return budget[n - 1];
        }

        int start = 0;
        int end = maxBudget;

        while (start <= end) {
            int current = 0;
            int mid = (start + end) / 2; // 상한가

            for (int i = 0; i < n; i++) {
                if (budget[i] > mid)
                    current += mid;
                else
                    current += budget[i];
            }

            // 현재 상한가로 예산을 맞추지 못할 경우에
            if (current > maxBudget) {
                end = mid - 1;
            }
            // 현재 상한가로 예산을 맞추기 부족함
            else if (current < maxBudget){
                start = mid + 1;
            }
            else
                return mid;
        }
        return end;
    }
}
