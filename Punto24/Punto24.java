package Punto24;


import java.util.Scanner;

public class Punto24 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		int a�os = 360;
		
		double total =(double)(24/0.12)*360;
		
		System.out.println("El capital despues de "+a�os+" a�os con un interes del 12% al a�o es de"+total+"$ USS");
		sc.close();
	}

}