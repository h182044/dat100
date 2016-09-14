package com.h182044;
import easyIO.Out;
public class Opg4 {
	public static void main(String[] args) {
		double x = 0;
		final int BREDDE1 = 16;
		Out utfil = new Out("Grader.txt");
		utfil.out("x i grader", BREDDE1);
		utfil.out("x i radianer", BREDDE1);
		utfil.out("sin(x)", BREDDE1);
		utfil.outln("cos(x)", BREDDE1);
		utfil.outln("---------------------------------------------------------");
		while(x <= 180)
		{
			double Grader = x;
			double Radianer = Math.toRadians(x);
			double Sinus = Math.sin(Radianer);
			double Cosinus = Math.cos(Radianer);
			utfil.out(Grader);
			utfil.out(Radianer, 3, 16);
			utfil.out(Sinus, 3, 16);
			utfil.outln(Cosinus, 3, 16);
			x = x+15;
		}
		utfil.outln("---------------------------------------------------------");
		utfil.close();
		System.out.println("Fullført!");
	}
}