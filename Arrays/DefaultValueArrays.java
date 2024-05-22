package Arrays;

import java.util.Arrays;

public class DefaultValueArrays {

	public static void main(String[] args) {

		int marks[]=new int[5];
		System.out.println(Arrays.toString(marks));
		
		String names[]=new String[6];
		for(String name:names) {
			System.out.println(name);
		}
		
		double sal[]=new double[3];
		for(int i=0;i<sal.length;i++) {
			System.out.println(sal[i]);
		}
	}

}
