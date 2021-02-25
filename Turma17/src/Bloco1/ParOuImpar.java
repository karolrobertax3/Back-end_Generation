package Bloco1;
import java.util.Scanner;

public class ParOuImpar {
		//CONDICIONAIS EXERCÍCI O4 
	public static void main(String[] args) {
		int num;
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um número");
		num = sc.nextInt();
		
		if(num%2==0) {
			resultado  = Math.sqrt(num); //fazendo raiz quadrada
		}
		else {
			resultado = Math.pow(num, 2); //ao quadrado
			
		}
		System.out.println("Resultdo: " + resultado);
	}

	

}
