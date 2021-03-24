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
		
		System.out.println("\nLista de produtos: " + estoque);
		
		System.out.println("\nLista de produtos: " + estoque);
		estoque.remove("Calça");
		System.out.println("\nLista de nomes: " + estoque);
		
		System.out.println("\nLista de produto " + estoque);
		estoque.contains("Camisa");
		estoque.remove("Camisa");
		estoque.add("Blusa");
		System.out.println("Lista atualizada de produtos" + estoque);
		
		
		

	}

}
