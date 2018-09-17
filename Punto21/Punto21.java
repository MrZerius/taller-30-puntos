package Punto21;

import java.util.Scanner;

public class Punto21 {
	

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner (System.in);
		
		
		int num,cont;
		
		System.out.print("Ingrese un numero : ");
		num = sc.nextInt();
		cont = num;
		if(num % 2 == 0)
			
		{
			System.out.println("El numero " +num+ " es par ");
			for(int i=num;i>0;i--)
			{
				if(i % 2== 0)
				{
					cont = cont - 2;
					System.out.print(i+" - 2 = "+cont+"   ");
				}else {
					
				}
			}
		}else {
			System.out.println("El numero " +num+ " es impar ");
			
		}
		
		sc.close();
		
	}

}