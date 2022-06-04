package 기하;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2477_참외밭 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//고정적인 6각형 정하기
		int figure[] = new int[6];
		//방향(동서남북)
		int direction[] = new int[6];
		int num = Integer.parseInt(br.readLine());
		int maxWidth = 0;
		int maxHeight = 0;
		int mwNum = 0;
		int mhNum = 0;
		
		StringTokenizer st;
		
		for(int i=0;i<figure.length;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			direction[i] = Integer.parseInt(st.nextToken());
			figure[i] = Integer.parseInt(st.nextToken());
			//가로 최대길이 구하기
			if(direction[i] == 1 || direction[i] == 2) 
				if(figure[i]>maxWidth) {
					maxWidth = figure[i];
					mwNum = i;
				}
			//세로 최대길이 구하기
			if(direction[i] == 3 || direction[i] == 4) 
				if(figure[i]>maxHeight) {
					maxHeight = figure[i];
					mhNum = i;
				}
		}
		
		
		int mWidth;
		int mHeight;
		//작은 사각형의 높이 구하기
		if(mwNum == 0) mHeight = Math.abs(figure[1]-figure[5]);
		else if(mwNum == 5) mHeight = Math.abs(figure[4] - figure[0]); 
		else mHeight = Math.abs(figure[mwNum-1] - figure[mwNum+1]);
		//작은 사각형의 가로 구하기
		if(mhNum == 0) mWidth = Math.abs(figure[1]-figure[5]);
		else if(mhNum == 5) mWidth = Math.abs(figure[4] - figure[0]); 
		else mWidth = Math.abs(figure[mhNum-1] - figure[mhNum+1]);
//		System.out.println(mHeight);
//		System.out.println(mWidth);
		
		System.out.println(((maxWidth*maxHeight) - (mHeight * mWidth))*num);
//		for(int i=0;i<6;i++) {
//			System.out.println(direction[i]+" "+figure[i]);
//		}
		

	}

}
