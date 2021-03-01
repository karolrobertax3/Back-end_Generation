package Bloco1;

import java.util.Scanner;

public class PesquisaCaracteristica {
		//EXERCÍCIO 4 
		//LAÇOS DE REPETIÇÕES 26/02/2021
	
	public static void main(String[] args) {
		int i=1,idade, sexo, fatorPsicologico, countpessoascalmas=0, countmulhernervosa=0, counthomemagressivo=0, countoutroscalmos=0, countnervosa40=0, countcalma18=0;
		Scanner sc = new Scanner(System.in);
		
		while(i<=2 ) 
			{
			System.out.println("Entre com sua idade: ");
			idade = sc.nextInt();
		
			System.out.println("Entre com seu gênero: 1-- Feminino -- 2 Masculino -- 3 Outros ");
			sexo = sc.nextInt();
			
			System.out.println("Entre com o seu fator psicológico: 1 -- Calmo 2 -- Nervoso 3 -- Agressivo");
			fatorPsicologico = sc.nextInt();
			
			if(fatorPsicologico==1)
			{
				countpessoascalmas++;
			}
			
			if(sexo==1 && fatorPsicologico ==2)
			{
				countmulhernervosa++;
			}
			
			if(sexo==2 && fatorPsicologico ==3)
			{
				counthomemagressivo++;
			}
			
			if(sexo==3 && fatorPsicologico==1)
			{
				countoutroscalmos++;
			}
			
			if(fatorPsicologico ==2 && idade>40)
			{
				countnervosa40++;
			}
			
			if(fatorPsicologico ==1 && idade<18)
			{
				countcalma18++;

			}
		
		i++;
	}
	
		System.out.println("\nPessoas calmas: "+ countpessoascalmas);
		System.out.println("\nMulheres nervosas: "+ countmulhernervosa);
		System.out.println("\nHomens Agressivos: "+ counthomemagressivo);
		System.out.println("\nOutros calmos: "+ countoutroscalmos);
		System.out.println("\nNervosos com mais de 40 anos: "+ countnervosa40);
		System.out.println("\nCalmas com menos de 18 anos: "+ countcalma18);
}

}
 