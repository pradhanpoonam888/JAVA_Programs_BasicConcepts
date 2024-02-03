package arrays;

public class TwoDArrays {
	public static void main(String[] args) {
		int i,j;
		int [][]a= new int[4][4];
		for(i=0;i<4;i++) {
			for(j=0;j<4;j++) {
					a[i][j]= j;
					System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
