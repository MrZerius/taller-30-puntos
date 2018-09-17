package Punto24;


import java.util.Scanner;

public class Punto24 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		int años = 360;
		
		double total =(double)(24/0.12)*360;
		
		System.out.println("El capital despues de "+años+" años con un interes del 12% al año es de"+total+"$ USS");
		sc.close();
	}

}