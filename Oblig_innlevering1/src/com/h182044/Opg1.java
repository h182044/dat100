package com.h182044;

import java.util.Scanner;

public class Opg1 {

	public static void main(String[] args) {
		Scanner tastatur = new Scanner(System.in);
		int i = 0;
		do{
			System.out.println("Karakterpoeng: ");
		int karakterpoeng;
		karakterpoeng = tastatur.nextInt();
		
		if(karakterpoeng <= 100 && karakterpoeng >= 90)
		{
			System.out.println("Karakter: A");
			i++;
		}
		else if(karakterpoeng <= 89 && karakterpoeng >= 80)
		{
			System.out.println("Karakter: B");
			i++;
		}
		else if(karakterpoeng <=79 && karakterpoeng >= 60)
		{
			System.out.println("Karakter: C");
			i++;
		}
		else if(karakterpoeng <=59 && karakterpoeng >= 50)
		{
			System.out.println("Karakter: D");
			i++;
		}
		else if(karakterpoeng <= 49 && karakterpoeng >= 40)
		{
			System.out.println("Karakter: E");
			i++;
		}
		else if(karakterpoeng <=39 && karakterpoeng >= 0)
		{
			System.out.println("Karakter: F");
			i++;
		}
		else
		{
			System.out.println("ugyldig poengsum, vennligst prøv igjen.");
		}
		}while(i < 10);
		tastatur.close();
	}

}

