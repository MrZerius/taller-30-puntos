package Punto25;

import java.util.Scanner;

public class Punto25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int prestamo = 200;
		int anos = 5;
		int interes = 6/100;
		
		double total = prestamo + ((prestamo*interes) * anos);
		
		System.out.println("transcurrido los 5 años habra pagado : "+total++);
		
		sc.close();
		
	}
	
}
