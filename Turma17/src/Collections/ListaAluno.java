package Collections;

import java.util.HashSet;
import java.util.Set;

public class ListaAluno {
	public static void main(String[] args) {
		Set<Aluno> conjunto = new HashSet<Aluno>();
		Aluno a = new Aluno("Joao da Silva", "Java", 6.8);
		Aluno b = new Aluno("Maria Souza", "Linux", 7.8);
		Aluno c = new Aluno("Renata Almeida", "Sistemas Operacionais", 8);
		Aluno d = new Aluno("José Nascimento", "Internet", 5.5);
		
		conjunto.add(a);
		conjunto.add(b);
		conjunto.add(c);
		conjunto.add(d);
		
		System.out.println(conjunto);
	}
}
