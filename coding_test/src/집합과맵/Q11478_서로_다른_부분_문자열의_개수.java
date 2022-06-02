package 집합과맵;
//2022-06-02
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q11478_서로_다른_부분_문자열의_개수 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		//substring(시작index, 원하는길이) 메소드를 사용해야하므로 시시각각 변하는 i, j를 사용해야함 => 이중 for문
		//HashMap을 안 쓰면 시간초과?
		int n = 0;
		for(int i=0;i<S.length();i++) {
			for(int j=i+1;j<=S.length();j++) {
				String str = S.substring(i, j);
				map.put(str, n++);
			}
		}
//		System.out.println(map);
		System.out.println(map.size());
	}

}
