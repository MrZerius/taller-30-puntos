package Punto23;

import java.util.Scanner;

public class Punto23 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner (System.in);
		
		int cont = 0;
		
		
		for(int i=1;i<10000;i += 4)
			
		{
			
			if(cont == 500)
				
			{
				
				break;
				
			}else {
				
				System.out.println(i);
				cont +=1;
			}
			
		}
		sc.close();
		

	}

}