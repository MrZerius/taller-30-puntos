package Punto16;

import java.util.Scanner;

public class Punto16 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		
		int deuda, pago, creditof, creditoc;
		
		
		System.out.print("Digite el monto de la deuda (sin puntos ni comas) : ");
		deuda = sc.nextInt();
		
		System.out.print("Cuanto pago el usuario : ");
		pago =  sc.nextInt();
		
		
		if(deuda == pago)
		{
			System.out.println("El cliente no debe nada");
		}else if(pago > deuda)
		{
			creditof = pago - deuda;
			System.out.println("El cambio es de : "+creditof);
		}else {
			creditoc =(deuda-pago)+(deuda-pago)* (3 / 100);
			System.out.println("La nueva deuda es de :"+creditoc);
		}
		sc.close();
		
	}

}