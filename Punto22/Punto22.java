package Punto22;

import java.util.Scanner;

public class Punto22 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Distancia recorrida por la pelota ");
		
		double Altura=10,AlFinal=0; 
		
		for(int i=0;i<40;i++) {
			
			Altura = ( Altura * 0.6666666666666667 );
			
			AlFinal+=Altura;
		}
		
		System.out.println(String.format("%.2f",(AlFinal+40)));	
		System.out.println("en su rebote 40");
		sc.close();

	}

}
