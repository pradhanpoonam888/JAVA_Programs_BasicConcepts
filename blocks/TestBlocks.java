package blocks;

public class TestBlocks {
	
	static {
		System.out.println("Inside Static Block");
		int i=10;
	}
	public TestBlocks(){
		System.out.println("Inside the constructor.");
	}
	{
		System.out.println("Inside the Non Static Block - Instance Block ");
	}
	public void testing() {
		System.out.println("Inside a method");
		{
			System.out.println("Inside a Local Block");
		}
	}

	public static void main(String[] args) {
		TestBlocks t=new TestBlocks();
		t.testing();
	}

}
