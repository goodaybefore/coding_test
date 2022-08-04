package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10158_개미 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int w = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int p = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

		int hour = Integer.parseInt(br.readLine());
		
		p += hour % (w*2);
		q += hour % (h*2);
		if(p>w) p = Math.abs(w*2 - p);
		if(q>h) q = Math.abs(h*2 - q);
//		p = w - Math.abs(w - (hour+p) % (2*w));
//		q = h - Math.abs(h - (hour+q) % (2*h));
		
		bw.write(p + " "+q);
		bw.close();
		br.close();

	}

}
