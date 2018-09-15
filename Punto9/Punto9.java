package Punto1;

import java.util.Scanner;

public class Punto9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int minutos,segundos,dias;
		
		double horas;
		
		do {
			System.out.print("Ingrese la cantidad de horas : ");
			horas  = sc.nextDouble();
			
		}while(horas<1);
		
		dias = (int) (1*horas)/24;
		
		minutos =(int)((3600*horas)/60);
		
		segundos = (int)(horas * 3600)+(minutos*60);
		
		
		System.out.println("Segundos : "+segundos);
		
		System.out.println("Minutos : "+minutos);
		
		System.out.println("Dias : "+dias);
		
	
	sc.close();
	
	}

}