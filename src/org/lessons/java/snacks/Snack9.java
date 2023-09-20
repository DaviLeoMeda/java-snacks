package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack9 {
	
//	Chiedere all'utente numeri interi e calcolarene la somma. 
//	Continuare a chiedere numeri, finche' la sommatoria non supera il valore `1000`
	
	public static void main(String[] args) {
		
		int sumNumbers = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (sumNumbers < 1000) {
			
			
			
			System.out.print("Insert a number: ");
			int numbers = sc.nextInt();
			
			
			
			sumNumbers += numbers;
			
		}
		sc.close();
		System.out.println("Your number is : " + sumNumbers);
	}
}
