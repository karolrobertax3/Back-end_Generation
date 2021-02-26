package Bloco1;

import java.util.Scanner;

public class DezNumeros {
	//EXERCÍCIO 2 DE REPETIÇÃO 26/02/2021

	public static void main(String[] args) {
		int i,number, countpar=0, countimpar=0;
		
		Scanner sc = new Scanner(System.in);
						
		for (i =0; i<10; i++) 
		{
			System.out.println("Insira um número:");
			number = sc.nextInt();
			
				if(number%2==0){
					
					countpar ++;
					
				}
				else {
					
					countimpar++;
					
				}
				System.out.println("\nPares:" + countpar + " Impares: "+ countimpar);
		} 

	}
}
