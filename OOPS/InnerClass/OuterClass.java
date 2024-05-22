package OOPS.InnerClass;

public class OuterClass {
	int j;
	
	public int getJ() {
		return j;
	}
	
	public class InnerClass{
		int i;
		public int getI() {
			return i;
		}
	}
	

	public static void main(String[] args) {
		OuterClass os=new OuterClass();
		os.j = 10;
		InnerClass ic=os.new InnerClass();
		ic.i=20;
		StaticInnerClass sic=new StaticInnerClass();
		sic.k=30;
		
		System.out.println("j : "+os.getJ());
		System.out.println("i : " + ic.getI());
		System.out.println("k : "+ sic.getK());
	
		System.out.println(os.demoMethod(300));

	}
	
	public static class StaticInnerClass{
		int k;
		
		public int getK() {
			return k;
		}
	}

	public int demoMethod(int e) {
		
		class InsideMethod{
			int total=100;
			public int getTotal() {
				return total+e;
			}
		}
		
		InsideMethod i=new InsideMethod();
		return i.getTotal();
		
	}
}
