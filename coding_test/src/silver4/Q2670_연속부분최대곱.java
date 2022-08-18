package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2670_연속부분최대곱 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double arr[] = new double[N];
		for(int i=0;i<N;i++) arr[i] = Double.parseDouble(br.readLine());
		
		double max = arr[0];
		for(int i=1;i<N;i++) {
			double tmp = arr[i-1] * arr[i];
			if(tmp > arr[i]) arr[i] = tmp;
			max = Math.max(max, arr[i]);
		}

		System.out.printf("%.3f", max);
	}

}
