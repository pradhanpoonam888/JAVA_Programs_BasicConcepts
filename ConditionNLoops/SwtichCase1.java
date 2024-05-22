package ConditionNLoops;

import java.util.Scanner;

public class SwtichCase1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number in words : ");
		String str = s.next();
		switch (str) {
		case "one":
			System.out.println(1);
			break;
		case "two":
			System.out.println(2);
			break;
		default:
			System.out.println("check your i/p");
			break;
		}

	}

}
