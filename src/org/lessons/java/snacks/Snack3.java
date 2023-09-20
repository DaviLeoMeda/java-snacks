package org.lessons.java.snacks;

public class Snack3 {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int myArray[] = new int [10];
		
		for (int a = 0; a < myArray.length; a++){
			myArray[a] = a;
		
			
			if (a % 2 != 0) {
				sum += a;
				};
				
			
		};
		
		System.out.println("The sum of the unpair numbers is: " + sum);
	}
}
