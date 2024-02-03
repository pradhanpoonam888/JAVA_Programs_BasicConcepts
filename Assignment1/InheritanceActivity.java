package Assignment1;

public class InheritanceActivity {
	
	Boss b1=new Boss(1,"Big Boss","Mumbai",12345,7500000);
	Boss b2=new Boss(2,"A Boss","Chennai",12346,6500000);
	Boss b3=new Boss(3,"B Boss","Delhi",12347,5500000);
	Boss b4=new Boss(4,"C Boss","Gujurat",12348,4500000);
	
	Trainee t1=new Trainee(5, "1 trainee", "Patiyala", 12347, 20000);
	Trainee t2=new Trainee(5, "2 trainee", "Mangalore", 12347, 20000);
	Trainee t3=new Trainee(5, "3 trainee", "Banglore", 12347, 20000);
	Trainee t4=new Trainee(5, "4 trainee", "Wadala", 12347, 20000);

	public static void main(String[] args) {
		InheritanceActivity ref= new InheritanceActivity();
		ref.testcase1();
		ref.testcase2();
		

	}
	public void testcase1() {
		System.out.println("-------- Employee Boss-1 ------------------");
		b1.print();
		System.out.println("-------- Employee Boss-2 ------------------");
		b2.print();
		System.out.println("-------- Employee Boss-3 ------------------");
		b3.print();
		System.out.println("-------- Employee Boss-4 ------------------");
		b4.print();
	}
	public void testcase2() {
		System.out.println("-------- Employee Trainee-1 ------------------");
		t1.print();
		System.out.println("-------- Employee Trainee-2 ------------------");
		t2.print();
		System.out.println("-------- Employee Trainee-3 ------------------");
		t3.print();
		System.out.println("-------- Employee Trainee-4 ------------------");
		t4.print();
	}
}
