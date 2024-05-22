package Basic.Strings;

import java.util.Arrays;

public class Tokennisation {

	public static void main(String[] args) {
		tokenize("abc;werf;r;ttyu;wrwer;.",";");
		tokenize(":A1:A2:A3:A4:A5:A6:",":");
	}

	private static void tokenize(String string,String delmiter) {
		String tokens[]=string.split(delmiter);
		System.out.println(Arrays.toString(tokens));
		
	}

}
