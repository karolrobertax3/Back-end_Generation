package Bloco1;

import java.util.Scanner;

public class DiasMesesAnos {
	//EXERC�CIO 2 PROGRAMA��O SEQUENCIAL DIA 24/02/2021
	public static void main(String[] args) {
		int dias, meses, anos, totalDias;
		Scanner read = new Scanner(System.in);
				
		System.out.println("Insira o total de dias: ");
		totalDias = read.nextInt();
		
		anos = totalDias / 365;
		meses = (totalDias % 365) / 30;
		dias = (totalDias % 365) % 30;
		
		System.out.println("Voc� viveu: "+ anos+ " anos "+ meses+ " meses "+ dias+ " dias");
	}

}
