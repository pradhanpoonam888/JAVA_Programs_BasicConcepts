package varargsNAsserts;

public class UseVarArgs {
	

	public int sum(int... nums) {
		int sum=0;
		for (int i : nums) {
			sum = sum + i;
		}
		return sum;

	}

	public static void main(String[] args) {

		UseVarArgs u = new UseVarArgs();
		
		System.out.println( u.sum(1,2));
		System.out.println( u.sum(100,200,300,400));
		System.out.println( u.sum(0));
		System.out.println( u.sum());
	}

}
