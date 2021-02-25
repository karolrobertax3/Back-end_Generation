package Bloco1;

import java.util.Scanner;

public class Dias {
		//EXERCÍCIO 1 PROGRAMAÇÃO SEQUENCIAL DIA 24/02/2021
	public static void main(String[] args) {
		int dias, meses, anos, totalDias;
		Scanner read = new Scanner(System.in);
		
		System.out.println("Insira sua idade em ano: ");
		anos = read.nextInt();
		
		System.out.println("Insira sua idade em meses: ");
		meses = read.nextInt();
		
		System.out.println("Insira sua idade em dias: ");
		dias = read.nextInt();
		
		totalDias = 365 * anos + 30 * meses + dias;
		
		System.out.println("Voce viveu um total de " + totalDias + " dias");
		
		

	}

}
