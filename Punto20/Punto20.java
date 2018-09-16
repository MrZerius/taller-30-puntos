package Punto20;

import java.util.Scanner;

public class Punto20 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner (System.in);
		int num = 5;
		
		
		System.out.println("Tabla de multiplicar del 5 ");
		
		
		for(int i=1 ; i < 11 ; i++)
		{
			
				
                System.out.println(num + " X " + i + " = " + num* i);
            
            System.out.println();
        }
		
		
		sc.close();
		
	}
	
}
