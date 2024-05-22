package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CompareArrays {
	
	static Scanner ip;
	static int size1;
	static int size2;
	static int[] arr1;
	private static int[] arr2;
	static boolean flag;
	static boolean flag2;

	public static void main(String[] args) {
		ip=new Scanner(System.in); 
		
		//Get Array1 from User
		//If User inputs anything other than int then java.util.InputMismatchException is thrown.
		
		size1 = getArraySize();
		arr1=new int[size1];
		arr1=insertArrayValues(size1);
			
		//Get Array2 from User
		
		size2 = getArraySize();
		arr2=new int[size2];
		arr2=insertArrayValues(size2);
		
		// Compare the arrays
		// First check - array lengths should match
		if(size2!=size1) {
			System.out.println("Array Sizes are different!! : Array1 is - "+size1+" and Array2 is - "+size2);
		}else {
			System.out.println("Since Array Sizes are same hence proceed ahead.");
				flag = compare1(arr1,arr2);
				if(flag==true) {
					System.out.println("Array 1 is Equal to Array2");
				}else {
					System.out.println("Array 1 is NOT equal to Array2!!");
				}
				
				flag2 = compare2(arr1,arr2);
				if(flag2==true) {
					System.out.println("Array 1 is Equal to Array2");
				}else {
					System.out.println("Array 1 is NOT equal to Array2!!");
				}
		}
	
	}

	private static boolean compare2(int[] arr12, int[] arr22) {
		flag2 = true;
		
		for(int i=0;i<size1;i++) {
			
				if(arr12[i]!= arr22[i]) {
					System.out.println("Position "+i+" is not matching : arr12["+i+"]= "
							+arr12[i]+ " & arr22["+i+"]="+ arr22[i]);
					flag2 = false;
				}
			}
		
		
		return flag2;
	}

	private static boolean compare1(int[] arr12, int[] arr22) {
		flag = false;
		flag= Arrays.equals(arr12, arr22);
		
		return flag;
	}

	/**
	 * 
	 */
	public static int getArraySize() {
		System.out.println("Enter the Size of Array  : ");
		int i = ip.nextInt();
		ip.reset();
		return i;
	}

	/**
	 * @param arr12 
	 * 
	 */
	public static int[] insertArrayValues(int size) {
		int[] arr12 =new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Element of Array at position "+i+" :");
			
			arr12[i]=ip.nextInt();
		}
		System.out.println(Arrays.toString(arr12));
		ip.reset();
		return arr12;
	}

	

}
