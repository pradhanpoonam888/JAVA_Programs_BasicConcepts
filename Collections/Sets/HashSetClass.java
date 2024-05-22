package Collections.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetClass {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>();
		
		s.add(89);
		s.add(89);
		s.add(89);
		s.add(89);
		s.add(89);
		s.add(89);
		s.add(89);
		s.add(89);
		
		System.out.println(s); //O/p - [89] only one element was added as SETS dnt allow duplicates.
		
		s.add(34);
		s.add(78);
		s.add(300);
		s.add(200);
		s.add(50);
		s.add(100);
		
		System.out.println(s);
		
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
