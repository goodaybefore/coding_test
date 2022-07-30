package 문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Q1235_학생번호_틀림 {
	static int K = 0;
	static int len;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		String arr[] = new String[N];
		Set<String> set = new HashSet<>();
		
		for(int i=0;i<N;i++) arr[i] = br.readLine();
		
		len = arr[0].length();
		while(K++ <= len) {
			//일단 끝에서부터 자르면서 Set에 저장
			for(int i=0;i<N;i++) {
				String str = arr[i].substring(len - K);
				set.add(str);
			}
			//set 길이 == arr 길이 => 바로 해당K return
			//set 길이 != arr 길이 => set 재정의 && K++;
			if(set.size() == N) {
//				System.out.println(K);
				bw.write(K+"");
				bw.flush();
				bw.close();
				br.close();
				break;
			}
			set.clear();
		}
		
	}
}
