package InitialisationBlocks;

public class InitialiseBlock {
	
	static int i=0;
	final static String name = "MyClass";
	
	static {
		System.out.println("Static	Initializer");
		System.out.println("Name : "+ name);
	}
	
	{
		System.out.println("Instance Initializer");
		i++;
		System.out.println("Objects created till now :  "+i);
	}

	public static void main(String[] args) {
		InitialiseBlock i1=new InitialiseBlock();
		InitialiseBlock i2=new InitialiseBlock();
		InitialiseBlock i3=new InitialiseBlock();
		InitialiseBlock i4=new InitialiseBlock();
		InitialiseBlock i5=new InitialiseBlock();
		InitialiseBlock i6=new InitialiseBlock();
		InitialiseBlock i7=new InitialiseBlock();
		
	}
}
