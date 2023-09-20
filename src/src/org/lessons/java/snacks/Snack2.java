package org.lessons.java.snacks;

import java.util.Random;

public class Snack2 {

	public static void main(String[] args) {
		
		String [] fakeNames = {
				"Marc", "Francis", "John", "Annette", "Marianna", "Linda"
		};
 		
		String [] fakeSurnames = {
				"Parker", "Lindon", "Johnson", "Harrison", "Locak", "Gustavsson"
		};
		
		for(int i=0; i<6; i++) {
			Random rnd = new Random(); // meglio metterla fuori dal ciclo quando si può , per non appesantire il calcolo
			
			int nameIndex = rnd.nextInt(fakeNames.length);
			
			int surnameIndex = rnd.nextInt(fakeSurnames.length);
			
			System.out.println(fakeNames[nameIndex] + " " + fakeSurnames[surnameIndex]);
			
		};
	}
}
