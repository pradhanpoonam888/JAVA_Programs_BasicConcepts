package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ArrayListClass {

	public static void main(String[] args) {
		List<Object> mylist=new ArrayList<Object>();
		mylist.add("Shanaya");
		mylist.add(8);
		mylist.add(2345897.67);
		mylist.add('A');
		mylist.add('A');
		mylist.add('A');
		mylist.add("Bottles");
		
		System.out.println(mylist);
		mylist.remove(4);
		System.out.println(mylist);
		System.out.println(mylist.contains('A'));
		System.out.println(mylist.size());
		
		Iterator<Object> itr=mylist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Collections.sort(mylist);
		
		System.out.println(mylist);
	}

}
