package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert a number: ");
		int numb = sc.nextInt();
		
		
		sc.close();
		
		if (numb % 2 == 0 ) {
			System.out.println("The number is: " + numb);
		} else {
			System.out.println("The number is: " + (numb+1));
		}
		
		
	}
}
