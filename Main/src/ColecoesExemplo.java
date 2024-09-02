import java.util.*;

public class ColecoesExemplo {
    public static void main(String[] args) {
        // Exemplo de List (ArrayList)
        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Ana");
        listaDeNomes.add("Bruno");
        listaDeNomes.add("Carlos");
        listaDeNomes.add("Ana");  // Aceita duplicatas

        System.out.println("Lista de Nomes (ArrayList):");
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }

        // Exemplo de Set (HashSet)
        Set<String> conjuntoDeNomes = new HashSet<>();
        conjuntoDeNomes.add("Ana");
        conjuntoDeNomes.add("Bruno");
        conjuntoDeNomes.add("Carlos");
        conjuntoDeNomes.add("Ana");  // Não aceita duplicatas

        System.out.println("\nConjunto de Nomes (HashSet):");
        for (String nome : conjuntoDeNomes) {
            System.out.println(nome);
        }

        // Exemplo de Map (HashMap)
        Map<Integer, String> mapaDeIdParaNomes = new HashMap<>();
        mapaDeIdParaNomes.put(1, "Ana");
        mapaDeIdParaNomes.put(2, "Bruno");
        mapaDeIdParaNomes.put(3, "Carlos");

        System.out.println("\nMapa de ID para Nomes (HashMap):");
        for (Map.Entry<Integer, String> entrada : mapaDeIdParaNomes.entrySet()) {
            System.out.println("ID: " + entrada.getKey() + ", Nome: " + entrada.getValue());
        }
    }
}
