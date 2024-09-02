// Aula dia 20/08 uso do Predicate


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 

public class Main {
	
	public static void filtro (List<String> lista, Predicate<String> condicao) {
		for (String s: lista)
			if(condicao.test(s))
				System.out.println(s);
		
	}
	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		List <String> lista1 = Arrays.asList(
				"Santa Catarina",
				"Parana",
				"São Paulo",
				"Rio de Janeiro",
				"Brasilia",
				"Ceará"
				);
		
		System.out.println("Estados que iniciam com S");
		filtro (lista1, (s)-> s.startsWith("S"));
		
		System.out.println("");
		
		System.out.println("Estados que iniciam com A");
		filtro (lista1, (s)-> s.endsWith("a"));
		
		System.out.println("");
		
		System.out.println("Imprima toda a lista");
		filtro (lista1, (s)-> true);
		
		System.out.println("");
		
		System.out.println("Não Imprima a lista");
		filtro (lista1, (s)-> false);
		
		System.out.println("");
		
		System.out.println("Imprima estados com + 10 caracteres");
		filtro (lista1, (s)-> s.length()>10);

	}

}
