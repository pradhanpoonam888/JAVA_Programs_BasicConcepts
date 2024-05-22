package ConditionNLoops;

public class ifClass {

	public static void main(String[] args) {
		int i =30;
		if(i <=50) {
			System.out.println("i is less or equal to 50");
			if(i==50) {
				System.out.println("i is equal to 50");
			}else if(i<50){
				System.out.println("i is less than 50 : "+ i);
			}
		}else {
			System.out.println("i is greater than 50");
		}

	}

}
