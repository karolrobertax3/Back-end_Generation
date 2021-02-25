package Bloco1;

import java.util.Scanner;
	//CONDICIONAIS EXERCICIO 2
public class OrdemCrescente {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Insirao segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		num3 = sc.nextInt();
		
		if(num1 <= num2 && num2 <= num3) {
			System.out.printf("Sequência: %d\t%d\t%d",num1,num2,num3);
		}
		else if(num1 <= num3 && num3 <=num2) 
			{
			System.out.printf("Sequência: %d\t%d\t%d",num1,num3,num2);
			}
		else if(num2 <= num1 && num1 <= num3 )
		{
			System.out.printf("Sequência: %d\t%d\t%d",num2,num1,num3);
		}
		
		else if(num2 <= num3 && num3 <= num1 )
		{
			System.out.printf("Sequência: %d\t%d\t%d",num2,num3,num1);
		}
		else if(num3 <= num1 && num1 <= num2 )
		{
			System.out.printf("Sequência: %d\t%d\t%d",num3,num1,num2);
		}
	}
}