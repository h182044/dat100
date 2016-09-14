package com.h182044;
import java.util.Scanner;

import easyIO.In;

public class Opg2 {

	public static void main(String[] args) {
		System.out.println("Skriv inn et mønster: ");
		String filnavn = "test.txt";
		In innfil = new In(filnavn);
		int ant = innfil.inInt();
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		String[] navn = new String[ant];
		int antall = 0;
		for (int i = 0; i < ant; i++)
		{
			navn[i] = innfil.inLine();
			System.out.println(navn[i]);
		}
		for(int i = 0; i<ant; i++)
		{
			String fe = navn[i].toString();
			if(fe.contains(in))
		{
			antall++;
		}
		}
		for(int i = 0; i<ant; i++){
			int lengde = navn[i].length();
			if(lengde == 1)
			{
				System.out.println("Streng med ett tegn: " + navn[i]);
			}
			if(lengde % 2 == 0)
			{
				System.out.println("Partal: " + navn[i].substring(lengde/2-1,(lengde/2)+1));
				
			}
			if(lengde % 2 != 0 && lengde >= 3)
			{
				System.out.println("Oddetal: " + navn[i].substring(lengde/3, (lengde/3)+3));
			}
		}
		System.out.println("Antall ord som inneholder " + in + " = " + antall);
		innfil.close();
		sc.close();
	}

}
