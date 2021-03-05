package Collections;
import java.util.ArrayList;
import java.util.Collection;

public class Estoque {

	public static void main(String[] args) {
		
		//EXERCÍCIO COLLECTION 05/03/2021
		Collection<String> estoque = new ArrayList<String>();
		estoque.add("Camisa");
		estoque.add("Calça");
		estoque.add("Saia");
		estoque.add("Vestido");
		
		System.out.println("Lista de produtos: " + estoque);
		
		System.out.println("Lista de produtos: " + estoque);
		estoque.remove("Calça");
		System.out.println("Lista de nomes: " + estoque);
		
		System.out.println("Lista de produto " + estoque);
		estoque.contains("Camisa");
		estoque.remove("Camisa");
		estoque.add("Blusa");
		System.out.println(estoque);
		
		
		

	}

}
