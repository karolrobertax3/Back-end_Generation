package Bloco1;

import java.util.Scanner;

public class MultiploDeTres {

	public static void main(String[] args) {
		//EXERCÍCIO 6 
		//LAÇOS DE REPETIÇÕES 26/02/2021
		int number, soma=0,count=0;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("Entre com um numero: ");
			number = sc.nextInt();
				if(number!=0) 
				{
					if(number%3==0) {
						soma = soma + number;
							count++;
					}
				}
		}
		while(number!=0);
		media = soma / count;
		System.out.println(media);
	}

}
