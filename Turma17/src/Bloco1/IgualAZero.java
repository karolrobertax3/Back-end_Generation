package Bloco1;
import java.util.Scanner;

public class IgualAZero {

	public static void main(String[] args) 
	{
		// EXERC�CIO 5 
		//LA�OS DE REPETI��O 26/02/2021
		int numeros, soma=0;
		Scanner sc = new Scanner(System.in);
		
		do 
		{			
			System.out.println("Insira os n�meros: ");
			numeros = sc.nextInt();
			soma = soma + numeros;
						
		}while(numeros!=0);

		
		System.out.println("Total: " + soma);
	}	

}
