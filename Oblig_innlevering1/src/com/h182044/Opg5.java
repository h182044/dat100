package com.h182044;
import java.util.Scanner;

public class Opg5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int dag = 0;
		double total = 0, avgMax = 0;
		double[] array;
		array = new double[7];
		double max = array[0];
		System.out.println("Analyse av Temperaturer");
		System.out.println("------------------------");
		System.out.println("Skriv inn Temperaturene:");
		//do while l�kke for � f� 7 inputs.
		do{
			//Tar input fra bruker og legger det inn i tabell
			System.out.print(dag+1 +" dag: ");
			double Temperatur = input.nextDouble();
			array[dag] = Temperatur;
			//-----------------------------------------------
			//Legger til temperaturen for � finne gjennomsnitt
				total += array[dag];
				avgMax = total/array.length;
			//--------------------------------------
			//if l�kke for � sj� om dagens temperatur er h�gre en max.
			 if (array[dag] > max)
	         {
	          max = array[dag];
	         }
			 dag++;
		}while(dag <= 6 );
		System.out.println("Gjennomsnitstemperaturen var: " + avgMax);
		System.out.println("Den h�gste m�lte temperaturen var: " + max);
		input.close();
	}

}
