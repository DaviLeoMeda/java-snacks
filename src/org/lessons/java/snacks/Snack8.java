package org.lessons.java.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack8 {
	
//  Creare un array di 10 interi randomici compresi tra 100 e 150. 
//  Stampare tutti i valori contenuti nell'array (dopo averli inseriti). 
//  Stampare inoltre il valore minimo, 
//  massimo e la media.

  public static void main(String[] args) {
	  
	  int maxNum = 100;
      int minNum = 150;
      int middleNum = 0;
      int sumNum = 0;

      int [] randomNumbers = new int [10];

      for (int i = 0; i < randomNumbers.length; i++) {
          Random rnd = new Random();
          int RandomicNumber = rnd.nextInt(100,150);
          randomNumbers[i] = RandomicNumber;
          if(RandomicNumber > maxNum) {
        	  maxNum = RandomicNumber;
          }
          if(RandomicNumber < minNum) {
        	  minNum = RandomicNumber;
          }
          sumNum += RandomicNumber;
      }
      
      System.out.println(Arrays.toString(randomNumbers));
      
      middleNum = sumNum / randomNumbers.length;
      
      System.out.println(minNum);
      System.out.println(maxNum);
      System.out.println(middleNum);
      
  }

}
