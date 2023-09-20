package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack5 {

	public static void main(String[] args) {

		String myCode = "";

		boolean isNotNull = true;

		char[] numbers = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
		
		char [] symbols = {
				'$', '-', '#', '(' , ')' , 'ì', '%', '£', '@', '#', '§', '?', '!'
		};

		char[] myChar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'z',
				'v', };

		Scanner sc = new Scanner(System.in);

		while (isNotNull) {

			int symbolCont = 0;
			int numberCont = 0;
			int characterCont = 0;

			System.out.print("Insert a code with characters, symbols and numbers: ");
			myCode = sc.nextLine().toLowerCase();

			if (myCode.equals("0")) {
				isNotNull = false;
			}

			char[] myCodeArray = myCode.toCharArray();

//		prendere una singola lettera della parola (ciclo)
//		confronto con la singola lettera dell'array (ciclo)
//		aumentare il contatore corrispettivo

			for (int i = 0; i < myCodeArray.length; i++) {
				char singleCharCode = myCodeArray[i]; // si da una variabile al singolo pezzo di array creato dall frase
														// inserita //
				for (int j = 0; j < myChar.length; j++) {
					char singleCharWord = myChar[j]; // si da una variabile al singolo pezzo di array dell'elenco caratteri
					if (singleCharCode == singleCharWord) {
						characterCont++;
					}
				}
				for (int x = 0; x < numbers.length; x++) {
					char singleNumber = numbers[x];
					if (singleCharCode == singleNumber) {
						numberCont++;
					}
				}
				for (int y = 0; y < symbols.length; y++) {
					char singleSimb = symbols[y];
					if (singleCharCode == singleSimb) {
						symbolCont++;
					}
				}
			}


			System.out.println(characterCont);
			System.out.println(numberCont);
			System.out.println(symbolCont);
		}
		;

		sc.close();

	};

};
