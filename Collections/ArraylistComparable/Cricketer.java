package Collections.ArraylistComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cricketer implements Comparable<Cricketer> {

	int runs;
	String name;

	public Cricketer(String name, int runs) {
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
		List<Cricketer> list = new ArrayList<Cricketer>();
		list.add(new Cricketer("RAVI", 2345));
		list.add(new Cricketer("Bradman", 9996));
		list.add(new Cricketer("Sachin", 14000));
		list.add(new Cricketer("Dravid", 12000));
		list.add(new Cricketer("Ponting", 11000));
		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);
	}

	@Override
	public int compareTo(Cricketer that) {
		if (this.runs > that.runs) {
			return 1;
		}
		if (this.runs < that.runs) {
			return -1;
		}
		return 0;
	}

}
