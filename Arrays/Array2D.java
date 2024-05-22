package Arrays;

import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		int[][] matrix1= {{1,2,3},{4,5,6}};
		int[][] matrix2= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(matrix1));
		System.out.println(Arrays.deepToString(matrix1));
		System.out.println(Arrays.deepToString(matrix2));
		
		System.out.println(matrix2.length);
		
	}

}
