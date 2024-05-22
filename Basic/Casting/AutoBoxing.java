package Basic.Casting;

public class AutoBoxing {

	public static void main(String[] args) {
		//Autoboxing
		Integer num1=9;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		
		//Two wrapper objects created using new are not same object.
		Integer nineA = new Integer(19);
		Integer nineB = new Integer(19);
		System.out.println(nineA == nineB);//false
		System.out.println(nineA.equals(nineB));//true
	}
	
}
