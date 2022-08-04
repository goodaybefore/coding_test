package silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Document{
	int prior;
	boolean selected;
	
	Document(int p, boolean s){
		this.prior = p;
		this.selected  = s;
	}

	@Override
	public String toString() {
		return prior +" "+ selected+" ";
	}
	
}
public class Q1966_프린터큐 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<T;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			List<Document> que = new LinkedList<Document>();
			st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if(j == M) que.add(new Document(tmp, true));
				else que.add(new Document(tmp, false));
			}
			sb.append(printQueue(que)).append("\n");
		}
		System.out.println(sb);
		
	}
	public static int printQueue(List<Document> que) {
		int cnt = 0;
		while(!que.isEmpty()) {
			boolean printable = true;
			//현재 문서 출력
			Document now = que.remove(0);
			//모든 문서에 대해
			for(int i=0;i<que.size();i++) {
				//현재 문서의 중요도보다 높은 중요도를 가진 문서가 있다면 프린트 못함(false) + 맨뒤로
				if(now.prior < que.get(i).prior) {
					printable = false;
					que.add(now);
					break;
				}
				
			}
			//프린트 가능하면 cnt++
			if(printable) cnt++;
			//프린트 가능한데 선택한 문서이기까지 하다? 바로 return
			if(printable && now.selected) return cnt;
			
		}
		return cnt;
	}
}
