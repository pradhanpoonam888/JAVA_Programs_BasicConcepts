package Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListNum {

	public static void main(String[] args) {
		List<Integer> numlist=new ArrayList<Integer>();
		
		numlist.add(1);
		numlist.add(1123);
		numlist.add(12);
		numlist.add(1234);
		numlist.add(123);
		numlist.add(13);
		numlist.add(9);
		numlist.add(9);
		numlist.add(0);
		System.out.println(numlist);
		
		Collections.sort(numlist);
		
		System.out.println(numlist);
	}

}
