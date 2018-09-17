package Punto27;

import java.util.Scanner;

public class Punto27 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner (System.in);
		int []vector = new int[5];
		int suma = 0;
		
		for(int i=0;i < 5;i++)
		{
			System.out.print("Ingrese el "+(i+1)+" dato : ");
			vector[i] = sc.nextInt();
			suma = suma + vector[i];
		}
		
		suma = 0;
		
		for(int i=0; i < 5; i++)
		{
			suma = suma + vector[i];
			System.out.print(vector[i]+ " + ");
			if(i == 4)
			{
				System.out.println(" = "+suma);
			}else {
				
			}
			
		}
		
		System.out.println("La suma del vector es: "+suma);
		sc.close();
	}

}