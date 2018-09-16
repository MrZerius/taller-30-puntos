package Punto18;

import java.util.Scanner;

public class Punto18 {
	
	public static void main(String[] args) {
	

		
Scanner sc = new Scanner (System.in);
		
		String nombre;
		
		int horas,opcion,horasExtras;
		
		float sueldoHora,sueldototal;
		
		System.out.print("Ingrese el nombre del empleado: ");
		nombre = sc.nextLine();
		
		System.out.print("Ingrese las horas trabajadas por el trabajador: ");
		horas = sc.nextInt();
		
		System.out.print("Ingrese el valor del sueldo por hora del trabajador :");
		sueldoHora = sc.nextFloat();
		
		
		if(horas > 40)
		{
			sueldototal = (float) sueldoHora * horas;
		}else {
			
			
			
			System.out.println("Trabajo horas extras? 1.)Si  2.) No");
			opcion = sc.nextInt();
			
			switch(opcion){

			case 1: System.out.print("Ingrese las horas extras: ");
							horasExtras = sc.nextInt();
							sueldototal = (float) ((40 * sueldoHora)+(horasExtras * sueldoHora * 1.5));
							System.out.println("El sueldo de la persona "+nombre+" es de = "+sueldototal+" $pesos");
							break;
							
			case 2:horasExtras = 0;
							sueldototal = (float) ((40 * sueldoHora)+(horasExtras * sueldoHora * 1.5));
								
							System.out.println("El sueldo de la persona "+nombre+" es de = "+sueldototal+" $pesos");
							break;
			}
			
		}
		
		
		sc.close();
	}
}
