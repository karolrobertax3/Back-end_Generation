package Bloco1;
import java.util.Scanner;

public class Matriz3X3 {

	public static void main(String[] args) {
		// EXERCÍCIO 3 ARRAYS 01/03/2021
		int matriz[][] = new int [3][3], maior=0, count=0;
		
		Scanner leia = new Scanner(System.in);
		
		for(int l=0;l<3;l++) 
		{
			
			for(int c=0;c<3;c++) 
			{
				
				System.out.println("Entre com o numero: ");
				matriz[l][c] = leia.nextInt();
				//maior = matriz[l][c];
				/*for(int x=0;x<10;x++) {
					if(maior > matriz[l][c]) {
						maior = matriz[l][c];
					}
				}*/
				
				if(matriz[l][c]>10) 
				{
					
					count++;
				}
				
				
			}
		
			
		}	System.out.println("Valores maiores que 10: " +count);
			System.out.println(maior);
			//
			//leia.close();
		
		

	}

}
