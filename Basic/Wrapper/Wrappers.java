package Basic.Wrapper;

public class Wrappers {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
	
		
		Integer num1=new Integer("23");
		System.out.println("num1 : " + num1);
		System.out.println("num1.getClass() :" + num1.getClass());
		
		
		Float num2=new Float("34.5f");
		System.out.println("num2 : " + num2);
		System.out.println("num2.getClass() :" + num2.getClass());
		
		
		
		Short num3=new Short("20");
		System.out.println("num3 : " + num3);
		System.out.println("num3.getClass() :" + num3.getClass());
		
		
		Double  num4=new Double("34.5557678d");
		System.out.println("num4 : " + num4);
		System.out.println("num4.getClass() :" + num4.getClass());
		
		
		Long num5=new Long("3434387879793");
		System.out.println("num5 : " + num5);
		System.out.println("num5.getClass() :" + num5.getClass());
		
			
			Byte num6=new Byte("101");
			System.out.println("num6 : " + num6);
			System.out.println("num6.getClass() :" + num6.getClass());
			
			
			Boolean num7=new Boolean("FALSE");
			
			System.out.println("num7 : " + num7);
			System.out.println("num7.getClass() :" + num7.getClass());
			
			
			Character	c1 =	new Character('C');//Only	char	constructor
			//Character	c2	=	new	Character(124);//COMPILER	ERROR
			
			//Static MEthods 
			Integer hundred=Integer.valueOf(100);
			System.out.println("hundred : " + hundred);
			System.out.println("hundred.getClass() :" + hundred.getClass());
			
			Integer shun=Integer.valueOf("100");
			System.out.println("shun : " + shun);
			System.out.println("shun.getClass() :" + shun.getClass());
	}
	

}
