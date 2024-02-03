package abstraction;

public class Citi extends Bank {

	//@Override
	protected int getInterestRate() {
		// TODO Auto-generated method stub
		return 9;
	}
	
	public static void main(String [] args) {
		Bank citi=new Citi();
		
		System.out.println("RAte interest is : "+ citi.getInterestRate());
	}

	@Override
	protected void logo() {
		System.out.println("Your bank should have a unique Logo .");
		
	}

}
