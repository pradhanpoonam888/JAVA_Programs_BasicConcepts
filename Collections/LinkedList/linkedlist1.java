package Collections.LinkedList;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class linkedlist1 {

	public static void main(String[] args) {
		
		LinkedList<String> l=new LinkedList<String>();
		l.add("pappu");
		l.add("Sapna");
		l.add("Kapil");
		l.add("Kapil");
		l.add("Poonam");
		l.add("Appu");
		
		System.out.println(l);
		
		l.remove("Kapil");
		
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		
		Iterator<String> itr= l.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Iterator<String> itr2=l.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		
	}

}
