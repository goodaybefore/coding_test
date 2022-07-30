package silver4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Q1302_베스트셀러 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> books = new HashMap<String, Integer>();
		
		String bestSeller = "";
		int max = 0;
		while (N-- > 0) {
			String book = br.readLine();
			books.put(book, books.getOrDefault(book, 0)+1);
			if(books.get(book) > max) {
				bestSeller = book;
				max = books.get(book);
			}
			if(books.get(book) == max) {
				bestSeller = book.compareTo(bestSeller)<=0 ? book : bestSeller;
			}
		}
		System.out.println(bestSeller);
		
	}
}
