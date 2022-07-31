package silver4;
//머리아파서 못해먹겠네
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q2578_빙고____________미완성 {
	static int arr[][] = new int[5][5];
	static boolean bingo[][] = new boolean[5][5];
	static int line = 0;
	static int count = 0;
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<5;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		System.out.println();
		print();
		System.out.println();
		for(int i=0;i<5;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<5;j++) {
				int tmp = Integer.parseInt(st.nextToken());
				ans = 0;
				count++;
				//빙고판에서 해당 숫자를 찾아서 0으로 만들기
				find(tmp);
				//빙고 개수 몇개인지 체크
				check();
				if(line >= 3) {
					ans = count;
					System.out.println("ans : "+ans);
					return;
				}
			}
		}

	}
	public static void find(int tmp) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j] == tmp) arr[i][j] = 0;
			}
		}
	}
	public static int check() {
		System.out.println("그냥 line : "+line);
		//세로 빙고 개수 확인
		for(int i=0;i<5;i++) {
			int cnt = 0;
			for(int j=0;j<5;j++) {
				if(arr[i][j]==0) cnt++;
			}
			if(cnt == 5) line++;
		}
		System.out.println("세로까지 합하면 : "+line);
		
		//가로 빙고 개수 확인
		for(int i=0;i<5;i++) {
			int cnt = 0;
			for(int j=0;j<5;j++) {
				if(arr[j][i]==0) cnt++;
			}
			if(cnt == 5) line++;
		}
		System.out.println("가로까지 합하면 : "+line);
		
		//대각선 빙고 개수 확인(왼->오)
		int cnt = 0;
		for(int i=0;i<5;i++)
			if(arr[i][i] == 0) cnt++;
		if(cnt == 5) line++;
		System.out.println("대각선까지 합하면 : "+line);
		
		//대각선 빙고 개수 확인(오->왼)
		cnt = 0;
		for(int i=0;i<5;i++)
			if(arr[i][4-i] == 0) cnt++;
		if(cnt == 5) line++;
		System.out.println("대각선 합하면2 : "+line);
		return line;
	}
	public static void print() {
		//빙고판 출력
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
