package Bloco1;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) 
		{
			// EXERCÍCIO 3 
			//LAÇOS DE REPETIÇÕES 26/02/2021
			int idade=0, totalMenos21=0, totalMais50=0, count= 0;
			Scanner sc = new Scanner(System.in);
		
			while(idade!= -99) 
			{
				System.out.print("\nInsira sua idade ");
				idade = sc.nextInt();
					if(idade <21 ) {
						totalMenos21++; 
				
				
					}
					else if( idade >50) {
						totalMais50++;
											
					}		
					System.out.println("\nTotal de pessoas com menos de 21: " + totalMenos21);
					System.out.println("Total de pessoas com mais de 50: " + totalMais50);
		}
	}
}
