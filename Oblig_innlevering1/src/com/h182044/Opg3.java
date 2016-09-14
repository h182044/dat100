package com.h182044;
import java.util.Scanner;
public class Opg3 {
	public static void main(String[] args) {
	//Scanner som leser inndata fra bruker.
	System.out.println("Enter two number values: ");
	Scanner inn = new Scanner(System.in);
	//--------------------------
	double x = inn.nextDouble();
	double n = inn.nextDouble();
	int i = 1;
	double y = 1;
	//---------------------------
	double to = Math.pow(x, n);
	System.out.println("Math.pow result: " + to);
	//---------------------------
	while(i<=n)
	{
		y=y*x;
		i++;
	}
	//---------------------------
	System.out.println("For statement result:"+ y );
	inn.close();
	}

}

//Så lenge x og n er eit positivt heiltal så får eg samme svar. Dersom vi får negative eller
//tall med komma, vil svara bli ulike.