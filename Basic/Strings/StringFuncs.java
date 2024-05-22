package Basic.Strings;

public class StringFuncs {

	public static void main(String[] args) {
		String str="abcdefgh";
		System.out.println(str.charAt(3));
		//compare
		System.out.println(str.compareTo("abcd"));
		System.out.println(str.compareTo("ghfedcba"));
		System.out.println(str.compareTo("abcdefgh"));
		System.out.println(str.compareTo("abcdefghrr"));
		
		System.out.println(str.length());
		
		Integer i=1234;
		System.out.println(i.toString());
		System.out.println(str.equalsIgnoreCase("ABCDEFGH"));
		System.out.println(str.substring(4, 7));
	}

}
