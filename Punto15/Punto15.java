package Punto15;

import java.util.Scanner;

public class Punto15 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		
		
		int []vector = new int[3];
		
		int mayor=0, menor=99999;
		
		System.out.println("Digite 3 numeros enteros :");
		
		for(int i=0;i<3;i++)
		{
			vector[i] = sc.nextInt();
			if(vector[i] < menor)
			{
				menor = vector[i];
			}else if(vector[i] > mayor)
			{
				mayor = vector[i];
			}else {
				
			}
		}
		System.out.println(+menor+  " ← Menor ↔ Mayor → "+mayor++);
	
		
		sc.close();
	}

}