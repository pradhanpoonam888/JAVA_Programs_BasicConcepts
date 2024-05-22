package Basic.Strings;

public class StringzBuffer {

	
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("");
		String s2="Value";
		for(int i=0;i<6;i++) {
			s1.append(s2);
			s1.append(i);
			System.out.println(s1);
		}

	}

}
