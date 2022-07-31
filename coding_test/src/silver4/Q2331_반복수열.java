package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Q2331_반복수열 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String N = st.nextToken();
		int P = Integer.parseInt(st.nextToken());
		List<String> list = new ArrayList<String>();
		list.add(N);
		//N을 리스트 맨첫번째에 넣고 list의 마지막을 뽑아내서 계속 pow해주는 식으로해야할듯
		int ans = 0;
		boolean isContinue = true;
		int idx = 0;
		while(isContinue) {
			char[] num = list.get(idx).toCharArray();
			int sum = 0;
			for(int i=0;i<num.length;i++) {
				sum += Math.pow(num[i] - '0', P);
			}
			if(!list.contains(Integer.toString(sum))) list.add(Integer.toString(sum));
			else {
//				System.out.println("else!");
				for(int i=0;i<list.size();i++) {
					if(Integer.parseInt(list.get(i)) == sum) {
						ans = i;
						isContinue = false;
						break;
					}
				}
			}
			idx++;
		}
		System.out.println(ans);
	}

}
