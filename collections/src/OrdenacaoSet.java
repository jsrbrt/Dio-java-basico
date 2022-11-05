import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class OrdenacaoSet {
    /*Dadas as seguintes informações sobre minhas séries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de episódio);
Série 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
Série 2 = nome: dark, genero: drama, tempoEpisodio: 60
Série 3 = nome: that '70s show, genero: comédia, tempoEpisodio: 25
*/
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>();
        minhasSeries.add(new Serie("got", "fantasia", 60));
        minhasSeries.add(new Serie("dark", "drama", 60));
        minhasSeries.add(new Serie("that '70s show", "comédia", 25));

        System.out.println("Exiba as séries de ordem aleatória:");
            //Collections.shuffle(minhasSeries);
            System.out.println(minhasSeries);
System.out.println();

        System.out.println("Exiba as séries de ordem de inserção:");
            Set<Serie> minhasSeries2 = new LinkedHashSet<>();
            minhasSeries2.add(new Serie("got", "fantasia", 60));
            minhasSeries2.add(new Serie("dark", "drama", 60));
            minhasSeries2.add(new Serie("that '70s show", "comédia", 25));

            System.out.println(minhasSeries2);
System.out.println();

//o comparable é necessário pra chamar o treeset, sem o codigo dele fazendo a comparação, não funciona
        System.out.println("Exiba as séries na ordem natural:");
            Set<Serie> minhasSeries3 = new TreeSet<>(minhasSeries);
            System.out.println(minhasSeries3);
System.out.println();

//tenho que chamar com new pq nao existe aqui nessa classe
        System.out.println("Exiba as séries na ordem nome/gênero/tempo de episodio:");
            Set<Serie> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
            //addAll recebe a collection
            minhasSeries4.addAll(minhasSeries);
            System.out.println(minhasSeries4);
System.out.println();

        System.out.println("Exiba as séries na ordem por gênero");
        Set<Serie> minhasSeries5 = new TreeSet<>(new ComparatorGenero());
        minhasSeries5.addAll(minhasSeries);
        System.out.println(minhasSeries5);
System.out.println();

        System.out.println("Exiba as séries na ordem por tempo de episodio");
        Set<Serie> minhasSeries6 = new TreeSet<>(new ComparatorTempoEpisodio());
        minhasSeries6.addAll(minhasSeries);
        System.out.println(minhasSeries6);
    }
}
class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;
    
    public Serie(String nome, String genero, Integer tempoEpisodio){
        this.nome= nome;
        this.genero=genero;
        this.tempoEpisodio = tempoEpisodio;
    }
    public String getNome(){
        return nome;
    }
    public String getGenero(){
        return genero;
    }
    public Integer getTempoEpisodio(){
        return tempoEpisodio;
    }
    @Override
    public String toString(){
        return "{nome = '" + nome + "' " + "gênero = '" + genero + "' " + "tempo de episódio = '" + tempoEpisodio + "'}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        //o metodo int compare retorna -1 0 1, se for -1 eles são diferentes e o comparado tem um valor menor, se for 0 eles são iguais e se for 1 eles diferem e o comparado tem um valor maior 
        if (tempoEpisodio != 0) return tempoEpisodio;
        //critério de desempate pq o set nao aceita igual
        return this.getGenero().compareTo(serie.getGenero());
    }
}
class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie> {
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        //se os nomes for diferente ele vai comparar por nome
        if(nome != 0) return nome;

        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        //se os nomes forem iguais e os generos difernetes, ele vai comparar por genero
        if(genero != 0) return genero;
        //se os generos forem iguais ele vai comparar por tempo de episodio, e se o tempo de episodio for igual as series são iguais, então tanto faz
        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
class ComparatorGenero implements Comparator<Serie> {
    public int compare(Serie s1, Serie s2){
        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        return genero;
    }
}
class ComparatorTempoEpisodio implements Comparator<Serie>{
    public int compare(Serie s1, Serie s2){
        int tempoEpisodio = s1.getTempoEpisodio().compareTo(s2.getTempoEpisodio()); 
        return tempoEpisodio;
    }
}

