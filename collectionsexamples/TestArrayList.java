package collectionsexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

public class TestArrayList {

	public static void main(String[] args) {
		
		
	ArrayList<String> al=new ArrayList();
	al.add("TEst");
	al.add("TEst1");
	al.add("TEst3");
	al.add("TEst3");
	al.add("TEst4");
	al.add("TEst5");
	al.add(2, "TEst2");
	printList(al);
	
	al.removeFirst();
	printList(al);
	ArrayList<String> al2=al;
	al.addAll(al);
	printList(al);
	
	printViaIterator(al);
	
	al.remove(3);
	printViaIterator(al);
	System.out.println( "Size of the Arralist : " +al.size());
	
	System.out.println(al.retainAll(al2)) ;
	printList(al);
	printList(al2);
	/*
	 * al2.clear(); printList(al2);
	 */
	System.out.println(al.contains("TEst3"));
	printViaIterator(al);
	System.out.println(al.containsAll(al2));
	//printViaIterator(al);
	}

	private static void printViaIterator(ArrayList<String> al) {
		Iterator it= al.iterator();
		System.out.println("================Printing via Iterator==================");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	private static void printList(ArrayList<String> al) {
		System.out.println("--------------Printing the list ---------------------");
		for(String i : al) {
			System.out.println(i);
		}
	}

}
