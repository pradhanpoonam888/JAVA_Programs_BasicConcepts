package Collections.ArraylistComparator;

import java.util.Comparator;

public class Sorting implements Comparator<Cricket>{

	public static void main(String[] args) {
		

	}

	@Override
	public int compare(Cricket o1, Cricket o2) {
		if(o1.getruns() > o2.getruns()) {
			return 1;
		}
		if(o1.getruns() < o2.getruns()) {
			return -1;
		}
		return 0;
	}

}
