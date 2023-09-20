package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Insert a word: ");
		String word = sc.nextLine();
		
		sc.close();
		
		String wordRev = "";
			
		for (int x=word.length(); x > 0; x--) {
			char reverse = word.charAt(x - 1);
			
			wordRev += reverse;	
		
		}
		
		if(word.toLowerCase().equals(wordRev.toLowerCase())) {
			System.out.println("La parola" + word + " è palindroma");
		} else {
			System.out.println("La parola" + word + " non è palindroma");
		};
		
	}

	
}
