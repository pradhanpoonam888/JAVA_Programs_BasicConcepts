package varargsNAsserts;

public class asserts2 {
	

	public int sum(int... nums) {
		int sum=0;
		for (int i : nums) {
			sum = sum + i;
		}
		return sum;

	}

	public static void main(String[] args) {
		boolean flag=true;
		asserts2 u = new asserts2();

		System.out.println( u.sum());
		int x =u.sum(100);
		assert(x==0);
		
	}

}
