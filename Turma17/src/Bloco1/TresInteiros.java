package Bloco1;

import java.util.Scanner;

public class TresInteiros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Insira o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Insirao segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Numero 1 é maior");
		}
		else if(num2 > num1 && num2 >num3) 
			{
			System.out.println("Numero 2 é maior");
		}
		else {
			System.out.println("Numero 3 é o maio");
		}

	}
}
