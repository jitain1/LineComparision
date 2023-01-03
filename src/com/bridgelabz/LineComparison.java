package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	
	static void compareLength(Integer lengthOfFirstLine, Integer lengthOfSecondLine) {
		System.out.println("Comparing the lengths..........");
		if(lengthOfFirstLine.equals(lengthOfSecondLine)) {
			System.out.println("Both Length are same.");
		}else {
			System.out.println("Both length are not same.");
			if (lengthOfFirstLine.compareTo(lengthOfSecondLine) > 0) {
				System.out.println("Length 1 is grater than Length 2.");
			} else {
				System.out.println("Length 2 is greater than Length 1.");
			}
		}
	}
	static int calculateLength(int x1, int y1, int x2, int y2) {
		int length = (int) Math.sqrt( (Math.pow((x1-x2),2) + Math.pow((y1-y2),2)) );
		return length;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the starting point of the 1st line (x1, y1): ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();	
		System.out.println("Enter the starting point of the 1st line (x2, y2): ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int lengthOfFirstLine = calculateLength(x1, y1, x2, y2);
		System.out.println("Length of 1st line = " + lengthOfFirstLine +"\n");
		System.out.println("Enter the starting point of the 2nd line (x3, y3): ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();	
		System.out.println("Enter the starting point of the 2nd line (x4, y4): ");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();
		
		int lengthOfSecondLine = calculateLength(x3, y3, x4, y4);
		System.out.println("Length of 1st line = " + lengthOfSecondLine);
		
		System.out.println("\n\n");
		compareLength(lengthOfFirstLine, lengthOfSecondLine);
		
		sc.close();
	}

}