package Bloco1;

import java.util.Scanner;

public class DezNumeros {
	//EXERC�CIO 2 DE REPETI��O 26/02/2021

	public static void main(String[] args) {
		int i,number, countpar=0, countimpar=0;
		
		Scanner sc = new Scanner(System.in);
						
		for (i =0; i<10; i++) 
		{
			System.out.println("Insira um n�mero:");
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
