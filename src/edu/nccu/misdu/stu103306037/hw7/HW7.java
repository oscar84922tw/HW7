package edu.nccu.misdu.stu103306037.hw7;

import java.util.Scanner;

public class HW7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		KeywordHeap keywords = new KeywordHeap();
		while (sc.hasNextLine()) {
			String cmd = sc.next();

			switch (cmd) {
			case "add":
				String name = sc.next();
				int count = sc.nextInt();
				float weight = sc.nextFloat();
				Keyword k = new Keyword(name, count, weight);
				keywords.add(k);
				break;
			
			case "removeMin":
				keywords.removeMin();
				break;

			case "peek":
				keywords.peek();
				break;

			case "output":
				keywords.output();
				break;
			
			default:
				break;
			}
		}
	}
}
