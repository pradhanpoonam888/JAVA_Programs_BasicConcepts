package collectionsexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList();
		ll.add("ABigel");
		ll.add("Lobster");
		ll.add("ClownFish");
		ll.add("Lobster");
		ll.add("Choco");
		ll.add("Pitcher");
		ll.add("Vitamins");
		ll.add("Unicorm");
		ll.add("press");
		
		Iterator itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		LinkedList<String> ll2=ll.reversed();
System.out.println("=============================");
		Iterator itr2=ll2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}
	
	
	private static void printList(ArrayList<String> al) {
		System.out.println("--------------Printing the list ---------------------");
		for(String i : al) {
			System.out.println(i);
		}
	}

}
