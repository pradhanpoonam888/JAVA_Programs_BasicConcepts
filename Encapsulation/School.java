package Encapsulation;

public class School {

	public static void main(String[] args) {

		Student s1=new Student();
		s1.setStudName("Shanaya");
		
		Student s2=new Student();
		s2.setStudName("Bhuban");
		
		System.out.println(s1.getStudName()+ " & " + s2.getStudName());		

	}

}
