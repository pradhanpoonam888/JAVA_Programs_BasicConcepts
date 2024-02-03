package collectionsexamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;

public class TestHashSet {
	static HashSet<String> hs=new HashSet();
	
	public static void main(String[] args) {
		

		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		hs.add("e");
		hs.add("f");
		hs.add("g");
		hs.add("h");
		hs.add("i");
		hs.size();
		print(hs);
		hs.add(null);
		System.out.println( hs.size());
		print(hs);
	}
	
	private static void print(HashSet<String> hs2) {
		System.out.println("==========================================");
		Iterator<String> i=hs.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("==========================================");
	}

}
