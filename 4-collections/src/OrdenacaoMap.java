import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class OrdenacaoMap {
    /*Dadas as seguintes informações sobre meus livros favoritos e seus autores,
crie um dicionário e ordene este dicionário:
exibindo (Nome Autor - Nome Livro);
Autor = Hawking, Stephen  - Livro = nome: Uma Breve História do Tempo. páginas: 256
Autor = Duhigg, Charles - Livro = nome: O Poder do Hábito, paginas: 408
Autor = Harari, Yuval Noah  - Livro = 21 Lições Para o Século 21, páginas: 432
*/
    public static void main(String[] args) {
        System.out.println("Dadas as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e ordene este dicionário:");
        Map<String, Livro> livros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        
        for (Map.Entry<String, Livro> entry : livros.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
System.out.println();

        System.out.println("Exiba os livros na ordem de inserção:");
        Map<String, Livro> livros2 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));
        }};

        for (Map.Entry<String,Livro> entry : livros2.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
System.out.println();

        System.out.println("Exiba os livros na ordem natural:");
        Map<String, Livro> livros3 = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> entry : livros3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
System.out.println();

        System.out.println("Exiba os livros na ordem por nome do livro:");
        Set<Map.Entry<String, Livro>> ordenarLivrosNome = new TreeSet<>(new ComparatorNome());

        ordenarLivrosNome.addAll(livros.entrySet());
        for (Map.Entry<String, Livro> entry : ordenarLivrosNome) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getNome());
        }
System.out.println();

        System.out.println("Exiba os livros na ordem por número de paginas:");
        Set<Map.Entry<String, Livro>> ordenarLivrosPaginas = new TreeSet<>(new ComparatorPaginas());

        ordenarLivrosPaginas.addAll(livros.entrySet());
        for (Map.Entry<String,Livro> entry2 : ordenarLivrosPaginas) {
            System.out.println(entry2.getKey() + " - " + entry2.getValue());
        }
    }
}
 class Livro{
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }
    public Integer getPaginas() {
        return paginas;
    }
    @Override
    public String toString() {
        return " nome: '" + nome + "', páginas: '" + paginas + "'";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }
}
class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2){
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
class ComparatorPaginas implements Comparator<Map.Entry<String, Livro>>{
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getPaginas().compareTo(l2.getValue().getPaginas());
    }
}
