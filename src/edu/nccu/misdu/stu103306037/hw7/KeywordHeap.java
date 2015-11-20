package edu.nccu.misdu.stu103306037.hw7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KeywordHeap {
	private PriorityQueue<Keyword> keywords = new PriorityQueue<Keyword>(
			new KeywordComparator());

	public KeywordHeap() {

	}

	public void add(Keyword k) {
		keywords.add(k);
	}

	public void removeMin() {
		if (keywords.isEmpty()) {
			System.out.println("Invalid Operation");
		}
		Keyword removed = keywords.remove();// 因為remove()會回傳被移除的值，故指派給removed
	}

	
	public void output() {
		// 移除全部並輸出
		if(keywords.isEmpty()){
			System.out.println();
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		while (!keywords.isEmpty()) {
			Keyword removed = keywords.remove();
			if (sb.length()>0) {
				sb.append(" ");
			}
			sb.append(removed.toString());
		
		}
		System.out.println(sb.toString());
//		//以下自己寫
//		for (int i = 0; i < keywords.size(); i++) {
//			System.out.print(keywords.peek());
//		}
	}
	
	public void peek(){
		if(keywords.isEmpty()){
			System.out.println("Invalid Operation");
			return;
		}
		
		Keyword minKeyword = keywords.peek();
		System.out.println(minKeyword.toString());
	}
}
