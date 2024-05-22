package Basic.Strings;

public class NewStringd {
	
	public static void main(String[] args) {
		//Strings r immutable
		String a="value1";
		System.out.println(a.concat("value2"));
		System.out.println(a);
		String concat=a.concat("value2");
		System.out.println(concat);
		System.out.println();
		
		//
		String b="value1";// here b is created but String value is reusedd from the string POol in the Heap Memory.
		
		if(a==b) {
			System.out.println("Two are equal");
		}else {
			System.out.println("Two are NOT equal");
		}
		
		// if new operator is use then new object is created in the heap & value is not reused.
		
		String c=new String("value1");
		if(c==a) {
			System.out.println("Two are equal");
		}else {
			System.out.println("Two are NOT equal");
		}
		if(c.equals(a)) {
			System.out.println("Two are equal");
		}else {
			System.out.println("Two are NOT equal");
		}
			
	
	}

}
