package Collections.ArraylistComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cricket {

	int runs;
	String name;

	public Cricket(String name, int runs) {
		this.name = name;
		this.runs = runs;
	}

	public int getruns() {
		return runs;
	}

	public String getname() {
		return name;
	}

	@Override
	public String toString() {

		return name + "	" + runs;

	}

	public static void main(String[] args) {
		List<Cricket> list = new ArrayList<Cricket>();
		list.add(new Cricket("RAVI", 2345));
		list.add(new Cricket("Bradman", 9996));
		list.add(new Cricket("Sachin", 14000));
		list.add(new Cricket("Dravid", 12000));
		list.add(new Cricket("Ponting", 11000));
		System.out.println(list);

		Collections
		.sort(list,	new Sorting());
		System.out.println(list);
	}

	

}
