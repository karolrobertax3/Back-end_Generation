package Bloco1;

public class VetorA {
	//EXERCÍCIO 1 ARRAYS 01/03/2021

	public static void main(String[] args) {
		int [] A = {1,0,5,-2,-5,7};
		int soma=0 ;
		
		for(int i=0;i<1;i++) 
		{
		 soma = A[0] + A[1] + A[5];
		 System.out.println("A soma dos vetores A[0] + A[1] + A[5] é: " + soma);
		 
		 A[4] = 100;
		 }
		
		for(int i=0;i<6;i++) {
			System.out.print( "\nValores do vetor A: " + A[i]);
		}
	}

}

