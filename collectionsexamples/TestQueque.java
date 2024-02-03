package collectionsexamples;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueque {

	public static void main(String[] args) {
		Queue<String> pq= new PriorityQueue<String>();
		
		pq.add("qqqqq");
		pq.add("RRRR");
		pq.add("ssss");
		pq.add("tttt");
		pq.add("uuuuu");
		pq.add("vvvv");
		pq.add("wwww");
		pq.add("xxxx");
		pq.add("yyyyyy");
		
		print(pq);
		
		System.out.println(pq.peek());
		print(pq);
		
		System.out.println(pq.poll());
		print(pq);
		
		System.out.println(pq.parallelStream());
		print(pq);
		
		/**
		 * ArrayDeque
		 */
		
		Queue<String> dq= new ArrayDeque<String>();
		
		dq.add("a");
		dq.add("b");
		dq.add("c");
		dq.add("d");
		dq.add("e");
		dq.add("f");
		dq.add("g");
		dq.add("h");
		dq.add("i");
		
		print(dq);
	}

	private static void print(Queue<String> pq) {
		System.out.println("==========================================");
		Iterator<String> i=pq.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("==========================================");
	}

}
