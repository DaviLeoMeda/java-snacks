package org.lessons.java.snacks;

import java.util.Scanner;

public class Snack7 {
	
//	Scrivere un programma che dati dei secondi li converta in ore, minuti, 
//	secondi e mostri a video la stringa generata (secondi → “hh:mm:ss”)

	public static void main(String[] args) {
		
//		prendere l'input dall'utente
		
//		------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insert the number of seconds: ");
		int mySeconds = sc.nextInt();
		
		sc.close();
		
//		fine dati da inserimento
//		------------------------------------------------------------
		
		
		String generalSeconds = null;
		String generalMinutes = null;
		String generalHours = null;
		
		
		
//		per ogni ora vi sono 3600 secondi
//		per ogni minuto ci sono 60 secondi
		
		generalHours = String.valueOf(mySeconds / 3600);
		generalMinutes = String.valueOf((mySeconds % 3600) / 60);
		generalSeconds = String.valueOf((mySeconds % 60)); 
		
		if((mySeconds % 60)< 10){
			generalSeconds = "0" + generalSeconds;
		}
		
		if(((mySeconds % 3600) / 60)< 10){
			generalMinutes = "0" + generalMinutes;
		}
		
		if((mySeconds / 3600)< 10){
			generalHours = "0" + generalHours;
		}
		
		System.out.println("Total seconds: " + "  ------>  " + generalHours + ":" + generalMinutes + ":" + generalSeconds);
		
		
		
	}
}
