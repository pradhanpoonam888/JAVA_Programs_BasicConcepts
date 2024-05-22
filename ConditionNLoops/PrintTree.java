package ConditionNLoops;

public class PrintTree {

	public static void main(String[] args) {
		//rightcone(0,1,5,5);
		//leftcone(-5,-5,10,10);
		tree(0,1,10,10);
	}

	/**
	 * 
	 */
	public static void rightcone(int start1,int start2, int limit1,int limit2) {
		for (int i = start1; i < limit1; i++) {
			for (int j = i; j < limit2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void leftcone(int start1,int start2, int limit1,int limit2) {
		for (int i = start1; i < limit1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void tree(int start1,int start2, int limit1,int limit2) {
		for (int i = start1; i < limit1; i++) {
			for (int j = limit2 ; j > i; j--) {
				
					System.out.print(" ");
				}
				
			for(int k=start2;k<i;k++) {
				System.out.print("*");
			}
			
			for(int l=start2-1;l<i;l++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}
}
