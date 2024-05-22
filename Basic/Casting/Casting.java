package Basic.Casting;

public class Casting {
	
	public static void main(String[] args) {
		//*****************************************************
		//Implicit Casting
		System.out.println("********* Implicit Csating ***********");
		int a=10;
		long b = a;//Implicit CAsting
		float c = b; // Implicit CAsting
		double d= c;
		
		System.out.println(a + " " +((Object)a).getClass());
		System.out.println(b + " " +((Object)b).getClass());
		System.out.println(c + " " +((Object)c).getClass());
		System.out.println(d + " " +((Object)d).getClass());
		
		//*****************************************************
		
		//*****************************************************
		//Explicit Casting
		System.out.println("********* Explicit Csating ***********");
		long e=234567;
		System.out.println(e + " " +((Object)a).getClass());
		int f=(int) e; // Explicit Casting
		System.out.println(f + " " +((Object)f).getClass());
		int g = (int) 23.45;
		System.out.println(g + " " +((Object)g).getClass());
		byte h= (byte) e;
		System.out.println(h + " " +((Object)h).getClass());
		//*****************************************************
	}

}
